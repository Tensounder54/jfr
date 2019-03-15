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

package objects;

import java.util.ArrayList;

/**
 * Class to store info about Freecycle regions as objects.
 *
 * @author T54 (Tensounder54)
 * @version 1.0.0
 */
public class Region {

    Country country;
    String name;
    ArrayList<Group> groups;

    /**
     *
     * @param rCountry
     * @param rName
     * @param rGroups
     * @return Region Returns a new Region.
     */
    public Region(Country rCountry,
                  String rName,
                  ArrayList<Group> rGroups
                  ) {
        country = rCountry;
        name = rName;
        groups = rGroups;
    }

    /**
     * Getter function for variable country.
     *
     * @return Country country
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Getter function for variable name.
     *
     * @return String name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter function for variable groups.
     *
     * @return ArrayList<Group> groups
     */
	public ArrayList<Group> getGroups() {
		return groups;
	}

}
