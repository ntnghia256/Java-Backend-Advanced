import java.util.Date;

public class Exam {
    private int examId;
    private String code;
    private String title;
    private int categoryId;
    private int duration;
    private int creatorId;
    private Date createDate;

    public Exam(int examId, String code, String title, int categoryId, int duration, int creatorId, Date createDate) {
        this.examId = examId;
        this.code = code;
        this.title = title;
        this.categoryId = categoryId;
        this.duration = duration;
        this.creatorId = creatorId;
        this.createDate = createDate;
    }

    public String getTitle() {
        return title;
    }
}