import java.util.Date;

public class Question {
    private int questionId;
    private String content;
    private int categoryId;
    private int typeId;
    private int creatorId;
    private Date createDate;

    public Question(int questionId, String content, int categoryId, int typeId, int creatorId, Date createDate) {
        this.questionId = questionId;
        this.content = content;
        this.categoryId = categoryId;
        this.typeId = typeId;
        this.creatorId = creatorId;
        this.createDate = createDate;
    }

    public String getContent() {
        return content;
    }
}