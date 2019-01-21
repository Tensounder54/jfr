package objects;

import java.util.ArrayList;

public class Country {

    String id;
    String name;
    ArrayList<Region> regions;

    public Country(String identification,
                   String cName,
                   ArrayList<Region> cRegions
                   ) {
        id = identification;
        name = cName;
        regions = cRegions;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public ArrayList<Region> getRegions() {
        return regions;
    }
}
