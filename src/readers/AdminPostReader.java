package readers;

import objects.AdminPost;
import objects.Group;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.io.IOException;

public class AdminPostReader {
    
    public static AdminPost adminPostReader(int id, Group group) throws IOException {
        Document doc = Jsoup.connect("https://groups.freecycle.org/group/" + group + "/admin/" + id).get();
        Element groupBox = doc.getElementById("group_box");
        boolean titleBold;
        if (groupBox.child(3).tag().getName() == "h1") {
            titleBold = true;
        } else {
            titleBold = false;
        }
        return new AdminPost(id, group, groupBox.child(3).text(), titleBold, groupBox.child(4).html());
    }

}
