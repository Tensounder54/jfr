package objects;

public class AdminPost {

    int id;
    Group group;
    String type;
    String title;
    boolean titleBold;
    String description;

    public AdminPost(int identification,
                     Group apGroup,
                     String apTitle,
                     boolean apTitleBold,
                     String apDescription
                     ) {
        id = identification;
        group = apGroup;
        type = "Admin";
        title = apTitle;
        titleBold = apTitleBold;
        description = apDescription;
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
	
	public boolean isTitleBold() {
		return titleBold;
	}
	
	public String getDescription() {
        return description;
    }

}
