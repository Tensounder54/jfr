package objects;

import java.util.ArrayList;

public class Country {

    String id;
    String name;
    boolean hasRegions;
    ArrayList<Region> regions;

    public Country(String identification,
                   String cName,
                   boolean isRegional,
                   ArrayList<Region> cRegions
                   ) {
        id = identification;
        name = cName;
        hasRegions = isRegional;
        regions = cRegions;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
	
	public boolean isRegional() {
		return hasRegions;
	}
	
	public ArrayList<Region> getRegions() {
        return regions;
    }
    
}
