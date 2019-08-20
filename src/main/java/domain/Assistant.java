package domain;

import annotation.FileStorage;

@FileStorage(name = "Assistant")
public class Assistant extends Personnel {
    private Integer category;

    public Assistant(Long id,String name, Integer age, Integer salary, Integer category) {
        super(id, name, age, salary);
        this.category = category;
    }

    public Assistant() {
        super();
    }

    @Override
    public String toString() {
        return "Assistant{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                ", category=" + getCategory() +
                '}';
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }
}
