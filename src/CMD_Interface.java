import objects.*;
import readers.*;
import utils.*;
import java.util.ArrayList;
import java.awt.Desktop;

public class CMD_Interface {

	public CMD_Interface() {
		java.awt.Desktop.getDesktop().browse("https://i.imgur.com/rsgf7Q8.png");
		java.awt.Desktop.getDesktop().browse("https://github.com/Tensounder54/jfr/blob/master/README.md");
		java.awt.Desktop.getDesktop().browse("https://github.com/Tensounder54/jfr/blob/master/LICENSE");
		System.out.println("THIS SOFTWARE IS PROVIDED \"AS IS\" AND ANY EXPRESSED OR IMPLIED WARRANTIES, " +
				"INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS " +
				"FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS" +
				"BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL " +
				"DAMAGES (INCLUDING,  BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;" +
				"LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)\n HOWEVER CAUSED AND ON ANY " +
				"THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING " +
				"NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF " +
				"ADVISED OF THE POSSIBILITY OF SUCH DAMAGE."
		);
		System.out.println(" ");
		System.out.println("This is the CMD interface class for the JFR (Java Freecycle Reader).");
		System.out.println("Please ensure that you have read and understoond the README and ");
		System.out.println("LICENCE files before you use the JFR.");
		System.out.println("Created by T54.");
		System.out.println(" ");
		ArrayList<Country> countryArrayList = utils.CountryList.getCountryList();
	}
	
	public static void main(String[] args) {
		CMD_Interface cmd_interface = new CMD_Interface();
	}
}




