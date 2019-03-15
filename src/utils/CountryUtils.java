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

import objects.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.ArrayList;

public class CountryUtils {

    public static ArrayList<Country> getCountryList() throws IOException {
        ArrayList<Country> countries = new ArrayList<Object>();
        
        Document doc = Jsoup.connect("https://www.freecycle.org/browse?noautodetect=1").get();
        Element fullCountriesList = doc.getElementById("active_country_list");
        Elements countriesColumns = fullCountriesList.children();
        countriesColumns.remove(countriesColumns.size());
        for (int i = 0; i < countriesColumns.size(); i++) {
            for (int j = 0; j < countriesColumns.get(i).child(1).children().size(); j++) {
                Element country = countriesColumns.get(i).child(1).child(j).child(0);
                ArrayList<Region> regions = new ArrayList<Region>();
                /*boolean hasRegions;
                if (checkForRegions(country.attr("href").substring(32))) { hasRegions = true; }
                else { hasRegions = false; }*/
	            countries.add(new Country(country.attr("href").substring(32),
			            country.text(),
                        checkForRegions(country.attr("href").substring(32)),
			            regions));
            }
        }
        return countries;
    }

    public static boolean checkForRegions(String id) throws IOException {
        Document doc = Jsoup.connect("https://www.freecycle.org/browse/" + id).get();
        Element contentElement = doc.getElementById("content");
        if (contentElement.child(0).attr("id") == "active_region_list") {
            return true;
        }
        return false;
    }

    public static String getFlagPath(Country country) {
        return "https://static.freecycle.org/images/flags/" + country.getId() + ".png";
    }

}
