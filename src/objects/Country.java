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
 * Class to store information about a freecycle country.
 *
 * @author T54 (Tensounder54)
 * @version 1.0.0
 */
public class Country {

    String id;
    String name;
    boolean hasRegions;
    ArrayList<Region> regions;

    /**
     * Constuctor for country class.
     *
     * @param identification
     * @param cName
     * @param isRegional
     * @param cRegions
     */
    public Country(String identification,
                   String cName,
                   boolean isRegional,
                   ArrayList<Region> cRegions
                   ) {
        id = identification;
        name = cName;
        hasRegions = isRegional;
        regions = cRegions;
    }

    /**
     * Getter function for the id variable.
     *
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * Getter function for the name variable.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter function for the hasRegions variable.
     *
     * @return hasRegions
     */
	public boolean isRegional() {
		return hasRegions;
	}

    /**
     * Getter function for the regions variable.
     *
     * @return regions
     */
	public ArrayList<Region> getRegions() {
        return regions;
    }
    
}
