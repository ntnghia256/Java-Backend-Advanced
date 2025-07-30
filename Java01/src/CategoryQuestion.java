public class CategoryQuestion {
    private int categoryId;
    private String categoryName;

    public CategoryQuestion(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }
}