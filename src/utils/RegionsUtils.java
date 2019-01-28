package utils;

import objects.Country;
import objects.Region;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.ArrayList;

public class RegionsUtils {

    public static ArrayList<Region> getRegionsForCountry(Country country) throws IOException {
        ArrayList<Region> regions = new ArrayList<>();
        Document doc = Jsoup.connect("https://www.freecycle.org/browse/" + country.getId() + "/" + country.getName()).get();
        Element activeRegions = doc.getElementById("active_regions");
        Elements regionsColumns = activeRegions.children();
        regionsColumns.remove(regionsColumns.size());
        if (country.isRegional()) {
            for (int i = 0; i < regionsColumns.size(); i++) {
                for (int j = 0; j < regionsColumns.get(i).child(1).children().size(); j++) {
	                Element region = regionsColumns.get(i).child(1).child(j).child(0);
                    country.regions.add(new Region(country, region.text(), new ArrayList<Group>));
                }
            }
        } else {
            country.regions.add(new Region(country, country.getId() + "NullRegion", new ArrayList<Group>));
        }
        return regions;
    }
    
}
