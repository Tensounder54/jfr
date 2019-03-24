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

import readers.GroupReader;
import objects.Region;
import objects.Country;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

/**
 * Class to retreve the list of Groups from the passed Region.
 *
 * @author T54 (Tensounder54)
 * @version 1.0.0
 */
public class GroupUtils {

	/**
	 * Function to get the list of Groups from the passed Region.
	 *
	 * @param region The Region that the function is to get the groups for.
	 * @throws IOException Throws an IOExeption when it cannot access the Groups list page for the passed Region.
	 */
	public static void getGroups(Region region) throws IOException {
		Document doc = Jsoup.connect("https://www.freecycle.org/browse/" + region.getCountry + "/" + region.getName()).get();
		Element activeGroups = doc.getElementById("active_groups");
		Elements groupsCollumns = activeGroups.children();
		groupsCollumns.remove(groupsCollumns.size());
		for (int i = 0; i < groupsCollumns.size; i++) {
			for (int j = 0; j < groupsCollumns.get(i).child(1).children().size(); j++) {
				Element groupId = ;
				region.groups.add(
						GroupReader.groupReader(
								region,
								groupsCollumns.get(i).child(1).child(j).child(0).attr("href").subString(28)
						)
				);
			}
		}
	
	}
	
}
