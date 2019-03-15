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

public class Post {

    int id;
    Group group;
    String type;
    String title;
    String location;
    String date;
    String description;

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

    public int getId() {
        return id;
    }

    public Group getGroup() {
        return group;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getImagePath() {
        return "https://groups.freecycle.org/group/" +
		        getGroup() +
		        "/post_image/" +
		        Integer.toString(getId()) +
		        "/";
    }
    
    public String getThumbPath() {
	    return "https://groups.freecycle.org/group/" +
			    getGroup() +
			    "/post_thumb/" +
			    Integer.toString(getId()) +
			    "/";
    }

}
