package readers;

import objects.*;
import org.jsoup.select.Elements;
import utils.CountryUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.io.IOException;
import java.util.ArrayList;

public class GroupReader {

    public static Group groupReader(Region region, String id) throws IOException {
        Document groupPage = Jsoup.connect("https://groups.freecycle.org/group/" 
            + id + "/posts/all").get();
        Document descriptionPage = Jsoup.connect("").get();
        Element content = groupPage.getElementById("content");
        Element groupBox = descriptionPage.getElementById("group_box");
        Elements groupBoxElements = groupBox.children();
        groupBoxElements.remove(groupBoxElements.size());
        groupBoxElements.remove(0);
        groupBoxElements.remove(1);
        String description = "";
        for (int i = 0; i < groupBoxElements.size(); i++) {
            description.concat(groupBoxElements.get(i).html());
        }
        ArrayList<AdminPost> adminPosts = new ArrayList<AdminPost>();
        ArrayList<Post> posts = new ArrayList<Post>();
        return new Group(id, 
                         content.child(0).child(0).text(),
		                 region.getCountry(),
                         region,
                         description,
                         Integer.parseInt(content.child(7).text().substring(20, content.child(7).text().length()-9)),
                         Integer.parseInt(content.child(0).child(0).text().substring(0, content.child(0).child(0).text().indexOf("M")-1)),
                         adminPosts,
                         posts
                         );
    }

    public static void addAdminPosts(Group group) throws IOException {
        Document groupPage = Jsoup.connect("https://groups.freecycle.org/group/"
                + group.getId() + "/posts/all").get();
        Element group_admin_box = groupPage.getElementById("group_admin_box");
        Elements adminPostElements = group_admin_box.children();
        //ArrayList<AdminPost> adminPosts = new ArrayList<AdminPost>();
        for (int i = 0; i < adminPostElements.size(); i++) {
            group.getAdminPostList().add(
            		AdminPostReader.adminPostReader(
            				Integer.parseInt(
            						adminPostElements.get(i).child(0).attr("href").substring(42 + group.getId().length())
				            ), group
		            )
            );
        }
    }

    public static void addPosts(Group group) throws IOException {
        int postCount = group.getPostCount();
        int pageCount = Integer.parseInt(String.valueOf(postCount / 100).split(".")[0]);
        for (int i = 0; i < pageCount; i++) {
            Document groupPage = Jsoup.connect("https://groups.freecycle.org/group/"
                    + group.getId() + "/posts/all?page=" + i + "&resultsperpage=100").get();
            Element group_posts_table = groupPage.getElementById("group_posts_table");
            Elements postsList = group_posts_table.child(0).children();
            for (int j = 0; j < postsList.size(); j++) {
                group.getPostList().add(
                        PostReader.PostReader(
                                Integer.parseInt(
                                        postsList.get(j).child(0).attr("href").substring(8).split("/")[4]
                                ), group
                        )
                );
            }
        }
    }

    private static boolean ensureStandardGroupId(String id) {
    	Boolean isValidId = false;
    	
    	return isValidId;
    }
    
    //private static void nonStandardGroups(String id) {}

}
