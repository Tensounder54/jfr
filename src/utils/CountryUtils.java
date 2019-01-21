package utils;

import objects.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.ArrayList;

public class CountryUtils {

    public static ArrayList<Object> getCountryList() throws IOException {
        ArrayList<Country> countries = new ArrayList<Object>();
        
        Document doc = Jsoup.connect("https://www.freecycle.org/browse?noautodetect=1").get();
        Element fullCountriesList = doc.getElementById("active_country_list");
        Elements countriesColumns = fullCountriesList.children();
        countriesColumns.remove(countriesColumns.size());
        for (int i = 0; i < countriesColumns.size(); i++) {
            for (int j = 0; j < countriesColumns.get(i).child(1).children().size(); j++) {
                Element country = countriesColumns.get(i).child(1).child(j).child(0);
                boolean hasRegions;
                if (checkForRegions(country.attr("href").substring(32))) {
                	ArrayList<Region> regions = new ArrayList<Region>();
                	countries.add(new Country(country.attr("href").substring(32),
			                country.text(),
			                regions));
                } else {
                	ArrayList<Group> groups = new ArrayList<Group>();
	                countries.add(new Country(country.attr("href").substring(32),
			                country.text(),
			                groups));
                }
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

    public static int getTotalCountries() throws IOException {
        ArrayList<Country> countries = getCountryList();
        return countries.size();
    }

    public static Country getCountryFromId(String id) throws IOException {
        ArrayList<Country> countries = getCountryList();
        for (int i = 0; i < countries.size(); i++) {
            if (countries.get(i).getId() == id) {
                return countries.get(i);
            }
        }
        return null;
    }

    public static ArrayList<String> getAllCountryIds() throws IOException {
        ArrayList<String> ids = new ArrayList<>();
        ArrayList<Country> countries = getCountryList();
        for (int i = 0; i < countries.size(); i++) {
            ids.add(countries.get(i).getId());
        }
        return ids;
    }

}
