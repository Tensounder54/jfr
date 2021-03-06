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
 * Class to store information about freecycle groups as objects.
 *
 * @author T54 (Tensounder54)
 * @version 1.0.0
 */
public class Group {

    String id;
    String name;
    Country country;
    Region region;
    String description;
    int postCount;
    int memberCount;
    ArrayList<AdminPost> adminPostList;
    ArrayList<Post> postList;

    /**
     * Constuctor for Group.
     *
     * @param identification The ID of the Group to be created.
     * @param gName The name of the Group.
     * @param gCountry The Country that the Group belongs to.
     * @param gRegion The Region that the Group belongs to.
     * @param gDscription The description that the moderators of the Group have spesified.
     * @param gPostCount The total number of posts on the Group.
     * @param gMemberCount The number of members of the Group.
     * @param gAdminPostList The ArrayList of AdminPosts that are skied to the group.
     * @param gPostList The list of posts on the sub.
     * @return Group Returns a new group.
     */
    public Group(String identification, 
                 String gName, 
                 Country gCountry,
                 Region gRegion,
                 String gDscription, 
                 int gPostCount, 
                 int gMemberCount, 
                 ArrayList<AdminPost> gAdminPostList, 
                 ArrayList<Post> gPostList
                 ) {
        id = identification;
        name = gName;
        country = gCountry;
        region = gRegion;
        description = gDscription;
        postCount = gPostCount;
        memberCount = gMemberCount;
        adminPostList = gAdminPostList;
        postList = gPostList;
    }

    /**
     * Getter function for variable id.
     *
     * @return String id
     */
    public String getId() {
        return id;
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
     * Getter function for variable country.
     *
     * @return Country country
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Getter function for variable region.
     *
     * @return Region region
     */
    public Region getRegion() {
        return region;
    }

    /**
     * Getter function for variable description.
     *
     * @return String description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Getter function for variable postCount.
     *
     * @return int postCount
     */
    public int getPostCount() {
        return postCount;
    }

    /**
     * Getter function for variable memberCount.
     *
     * @return int memberCount
     */
    public int getMemberCount() {
        return memberCount;
    }

    /**
     * Getter function for variable adminPostList.
     *
     * @return ArrayList<AdminPost> adminPostList
     */
    public ArrayList<AdminPost> getAdminPostList() {
        return adminPostList;
    }

    /**
     * Getter function for variable postList.
     *
     * @return ArrayList<Post> postList
     */
    public ArrayList<Post> getPostList() {
        return postList;
    }
}
