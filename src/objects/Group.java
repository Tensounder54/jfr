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
 * Class to store information about freecycle groups.
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
     * @param identification
     * @param gName
     * @param gCountry
     * @param gRegion
     * @param gDscription
     * @param gPostCount
     * @param gMemberCount
     * @param gAdminPostList
     * @param gPostList
     * @return new Group
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
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * Getter function for variable name.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter function for variable country.
     *
     * @return country
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Getter function for variable region.
     *
     * @return region
     */
    public Region getRegion() {
        return region;
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
     * Getter function for variable postCount.
     *
     * @return postCount
     */
    public int getPostCount() {
        return postCount;
    }

    /**
     * Getter function for variable memberCount.
     *
     * @return memberCount
     */
    public int getMemberCount() {
        return memberCount;
    }

    /**
     * Getter function for variable adminPostList.
     *
     * @return adminPostList
     */
    public ArrayList<AdminPost> getAdminPostList() {
        return adminPostList;
    }

    /**
     * Getter function for variable postList.
     *
     * @return postList
     */
    public ArrayList<Post> getPostList() {
        return postList;
    }
}
