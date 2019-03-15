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

/**
 * Class to store info about admin posts.
 *
 * @author T54 (Tensounder54)
 * @version 1.0.0
 */
public class AdminPost {

    int id;
    Group group;
    String type;
    String title;
    boolean titleBold;
    String description;

    /**
     * Constructor for AdminPost
     *
     * @param identification
     * @param apGroup
     * @param apTitle
     * @param apTitleBold
     * @param apDescription
     * @return new AdminPost
     */
    public AdminPost(int identification,
                     Group apGroup,
                     String apTitle,
                     boolean apTitleBold,
                     String apDescription
                     ) {
        id = identification;
        group = apGroup;
        type = "Admin";
        title = apTitle;
        titleBold = apTitleBold;
        description = apDescription;
    }

    /**
     * Getter function for variable id.
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Getter function for variable group.
     *
     * @return group
     */
    public Group getGroup() {
        return group;
    }

    /**
     * Getter function for variable type.
     *
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * Getter function for variable title.
     *
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Getter function for variable titleBold.
     *
     * @return titleBold
     */
	public boolean isTitleBold() {
		return titleBold;
	}

    /**
     * Getter function for variable description.
     *
     * @return description
     */
	public String getDescription() {
        return description;
    }

}
