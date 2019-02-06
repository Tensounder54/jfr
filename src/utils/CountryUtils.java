package utils;

import objects.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.ArrayList;

public class CountryUtils {

    public static ArrayList<Country> getCountryList() throws IOException {
        ArrayList<Country> countries = new ArrayList<Object>();
        
        Document doc = Jsoup.connect("https://www.freecycle.org/browse?noautodetect=1").get();
        Element fullCountriesList = doc.getElementById("active_country_list");
        Elements countriesColumns = fullCountriesList.children();
        countriesColumns.remove(countriesColumns.size());
        for (int i = 0; i < countriesColumns.size(); i++) {
            for (int j = 0; j < countriesColumns.get(i).child(1).children().size(); j++) {
                Element country = countriesColumns.get(i).child(1).child(j).child(0);
                ArrayList<Region> regions = new ArrayList<Region>();
                /*boolean hasRegions;
                if (checkForRegions(country.attr("href").substring(32))) { hasRegions = true; }
                else { hasRegions = false; }*/
	            countries.add(new Country(country.attr("href").substring(32),
			            country.text(),
                        checkForRegions(country.attr("href").substring(32)),
			            regions));
            }
        }
        return countries;
    }

    public static boolean checkForRegions(String id) throws IOException {
        Document doc = Jsoup.connect("https://www.freecycle.org/browse/" + id).get();
        Element contentElement = doc.getElementById("content");
        if (contentElement.child(0).attr("id") == "active_region_list") {
            return true;
        }
        return false;
    }

    public static String getFlagPath(Country country) {
        return "https://static.freecycle.org/images/flags/" + country.getId() + ".png";
    }

}
