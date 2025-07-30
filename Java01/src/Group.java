import java.sql.Date;

public class Group {
    private int groupId;
    private String groupName;
    private int creatorId;
    private Date createDate;

    public Group(int groupId, String groupName, int creatorId, Date createDate) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.creatorId = creatorId;
        this.createDate = createDate;
    }

    public String getGroupName() {
        return groupName;
    }
}