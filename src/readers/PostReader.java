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

package readers;

import objects.Group;
import objects.Post;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.io.IOException;

public class PostReader {

    public static Post PostReader(int id, Group group) throws IOException {
        Document doc = Jsoup.connect("https://groups.freecycle.org/group/" 
            + group + "/posts/" + String.valueOf(id) + "/").get();
        Element postData = doc.getElementById("group_post");
        Element postDetailsElement = doc.getElementById("post_details");
        String[] typeAndTitle = postData.child(1).child(1).html().split(": ");
        String[] postDetails = {
            postDetailsElement.child(0).html().substring(23), 
            postDetailsElement.child(1).html().substring(20)
        };
        String description = postData.child(3).child(2).text();
        return new Post(id, 
                        group, 
                        typeAndTitle[0], 
                        typeAndTitle[1], 
                        postDetails[0], 
                        postDetails[1], 
                        description
                        );
    }

}
