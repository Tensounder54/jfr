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
 * Class to store information about a freecycle post as an object.
 *
 * @author T54 (Tensounder54)
 * @version 1.0.0
 */
public class Post {

    int id;
    Group group;
    String type;
    String title;
    String location;
    String date;
    String description;

    /**
     * Constructor for Post.
     *
     * @param identification The ID of the new Post.
     * @param fcGroup The freecycle group the the Post belongs to.
     * @param postType The type of Post that it is.
     * @param name The name of the Post.
     * @param postLocation The location that the Post is advertising in.
     * @param creationDate The date that the Post was created.
     * @param postDesc The description of the Post.
     * @return Post Returns a new Post.
     */
    public Post(int identification,
                Group fcGroup,
                String postType,
                String name,
                String postLocation,
                String creationDate,
                String postDesc
                ) {
        id = identification;
        group = fcGroup;
        type = postType;
        title = name;
        location = postLocation;
        date = creationDate;
        description = postDesc;
    }

    /**
     * Getter function for variable id.
     *
     * @return int id
     */
    public int getId() {
        return id;
    }

    /**
     * Getter function for variable group.
     *
     * @return Group id
     */
    public Group getGroup() {
        return group;
    }

    /**
     * Getter function for variable type.
     *
     * @return String type
     */
    public String getType() {
        return type;
    }

    /**
     * Getter function for variable title.
     *
     * @return String title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Getter function for variable location.
     *
     * @return String location
     */
    public String getLocation() {
        return location;
    }

    /**
     * Getter function for variable date.
     *
     * @return String date
     */
    public String getDate() {
        return date;
    }

    /**
     * Getter function for variable description.
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Creates a URL that links to the post image using the group name and the ID.
     *
     * @return String The URL of post image.
     */
    public String getImagePath() {
        return "https://groups.freecycle.org/group/" +
		        getGroup() +
		        "/post_image/" +
		        Integer.toString(getId()) +
		        "/";
    }

    /**
     * Creates a URL that links to the post image thumbnail using the group name and the ID.
     *
     * @return String The URL of post thumbnail.
     */
    public String getThumbPath() {
	    return "https://groups.freecycle.org/group/" +
			    getGroup() +
			    "/post_thumb/" +
			    Integer.toString(getId()) +
			    "/";
    }

}
