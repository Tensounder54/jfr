/*
 * Java Freecycle Reader - JFR
 * By T54 (Tensounder54)
 * Contact: t54@tutanota.com
 *
 * THIS SOFTWARE IS PROVIDED "AS IS" AND ANY EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
 * REGENTS OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR
 * BUSINESS INTERRUPTION HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
 * TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * The Java Freecycle Reader is licensed and distributed under the GNU Affero General Public License v3.0
 * https://www.gnu.org/licenses/agpl-3.0.en.html
 *
 */

package utils;

import objects.Country;
import objects.Region;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Class to handel the retreval of the Regions list for a passed Country.
 *
 * @author T54 (Tensounder54)
 * @version 1.0.0
 */
public class RegionsUtils {

    /**
     * Function to get the Regions list for the passed Country.
     *
     * @param country The Country to retreve the Regions for. Used to get the page that lists the Regions for this Country.
     * @return ArrayList<Region> that contail the Regons for the given Country.
     * @throws IOException Throws an IOExeption when it cannot access the Region list page for the passed Country.
     */
    public static ArrayList<Region> getRegionsForCountry(Country country) throws IOException {
        ArrayList<Region> regions = new ArrayList<>();
        Document doc = Jsoup.connect("https://www.freecycle.org/browse/" + country.getId() + "/" + country.getName()).get();
        Element activeRegions = doc.getElementById("active_regions");
        Elements regionsColumns = activeRegions.children();
        regionsColumns.remove(regionsColumns.size());
        if (country.isRegional()) {
            for (int i = 0; i < regionsColumns.size(); i++) {
                for (int j = 0; j < regionsColumns.get(i).child(1).children().size(); j++) {
                    Element region = regionsColumns.get(i).child(1).child(j).child(0);
                    country.regions.add(new Region(country, region.text(), new ArrayList<Group>));
                }
            }
        } else country.regions.add(new Region(country, country.getId() + "NullRegion", new ArrayList<Group>));
        return regions;
    }
    
}
