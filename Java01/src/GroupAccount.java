import java.util.Date;

public class GroupAccount {
    private int groupId;
    private int accountId;
    private Date joinDate;

    public GroupAccount(int groupId, int accountId, Date joinDate) {
        this.groupId = groupId;
        this.accountId = accountId;
        this.joinDate = joinDate;
    }
}