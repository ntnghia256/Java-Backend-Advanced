public class Answer {
    private int answerId;
    private String content;
    private int questionId;
    private boolean isCorrect;

    public Answer(int answerId, String content, int questionId, boolean isCorrect) {
        this.answerId = answerId;
        this.content = content;
        this.questionId = questionId;
        this.isCorrect = isCorrect;
    }

    public String getContent() {
        return content;
    }
}