package utils;

import readers.GroupReader;
import objects.Region;
import objects.Country;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class GroupUtils {
	
	public static void getGroups(Region region) throws IOException {
		Document doc = Jsoup.connect().get();
		Element activeGroups = doc.getElementById("active_groups");
		Elements groupsCollumns = activeGroups.children();
		groupsCollumns.remove(groupsCollumns.size());
		for (int i = 0; i < groupsCollumns.size; i++) {
			for (int j = 0; j < groupsCollumns.get(i).child(1).children().size(); j++) {
				Element groupId = ;
				region.groups.add(
						GroupReader.groupReader(
								region,
								groupsCollumns.get(i).child(1).child(j).child(0).attr("href").subString(28)
						)
				);
			}
		}
	
	}
	
}
