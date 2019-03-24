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

import objects.AdminPost;
import objects.Group;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.io.IOException;

/**
 * Class to read admin posts. Contains one class to handel reading.
 *
 * @author T54 (Tensounder54)
 * @version 1.0.0
 */
public class AdminPostReader {

    /**
     * Function gets reads AdminPosts based off passed paramiters.
     *
     * @param id The id of the post that is to be read. Used to ge the page for the AdminPost to be read.
     * @param group The group that the post belongs to. Used to ge the page for the AdminPost to be read.
     * @return AdminPost Returns new AdminPost.
     * @throws IOExceptionThrows an IOExeption when it cannot access the page to retreve the AdminPost.
     */
    public static AdminPost adminPostReader(int id, Group group) throws IOException {
        Document doc = Jsoup.connect("https://groups.freecycle.org/group/" + group + "/admin/" + id).get();
        Element groupBox = doc.getElementById("group_box");
        boolean titleBold = groupBox.child(3).tag().getName() == "h1";
        return new AdminPost(id, group, groupBox.child(3).text(), titleBold, groupBox.child(4).html());
    }

}
