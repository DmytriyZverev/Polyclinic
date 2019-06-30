package domain;

public class Assistant extends Personnel {
    private Integer category;

    public Assistant(String name, Integer age, Integer salary, Integer category) {
        super(name, age, salary);
        this.category = category;
    }

    public Assistant() {
        super();
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }
}
