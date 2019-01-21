package objects;

import java.util.ArrayList;

public class Region {

    Country country;
    String name;
    ArrayList<Group> groups;

    public Region(Country rCountry,
                  String rName,
                  ArrayList<Group> rGroups
                  ) {
        country = rCountry;
        name = rName;
        groups = rGroups;
    }

    public Country getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }
	
	public ArrayList<Group> getGroups() {
		return groups;
	}

}
