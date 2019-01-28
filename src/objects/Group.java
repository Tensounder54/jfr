package objects;

import java.util.ArrayList;

public class Group {

    String id;
    String name;
    Country country;
    Region region;
    String description;
    int postCount;
    int memberCount;
    ArrayList<AdminPost> adminPostList;
    ArrayList<Post> postList;

    public Group(String identification, 
                 String gName, 
                 Country gCountry,
                 Region gRegion,
                 String gDscription, 
                 int gPostCount, 
                 int gMemberCount, 
                 ArrayList<AdminPost> gAdminPostList, 
                 ArrayList<Post> gPostList
                 ) {
        id = identification;
        name = gName;
        country = gCountry;
        region = gRegion;
        description = gDscription;
        postCount = gPostCount;
        memberCount = gMemberCount;
        adminPostList = gAdminPostList;
        postList = gPostList;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }
    
    public Region getRegion() {
        return region;
    }
    
    public String getDescription() {
        return description;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getMemberCount() {
        return memberCount;
    }

    public ArrayList<AdminPost> getAdminPostList() {
        return adminPostList;
    }

    public ArrayList<Post> getPostList() {
        return postList;
    }
}
