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
