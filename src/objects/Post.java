package objects;

public class Post {

    int id;
    Group group;
    String type;
    String title;
    String location;
    String date;
    String description;

    public Post(int identification,
                Group fcGroup,
                String postType,
                String name,
                String postLocation,
                String creationDate,
                String postDesc
                ) {
        id = identification;
        group = fcGroup;
        type = postType;
        title = name;
        location = postLocation;
        date = creationDate;
        description = postDesc;
    }

    public int getId() {
        return id;
    }

    public Group getGroup() {
        return group;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getImagePath() {
        return "https://groups.freecycle.org/group/" +
		        getGroup() +
		        "/post_image/" +
		        Integer.toString(getId()) +
		        "/";
    }
    
    public String getThumbPath() {
	    return "https://groups.freecycle.org/group/" +
			    getGroup() +
			    "/post_thumb/" +
			    Integer.toString(getId()) +
			    "/";
    }

}
