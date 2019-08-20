package domain;

import annotation.FileStorage;

@FileStorage(name = "Aidman")
public class Aidman extends Personnel {
    private Integer increase;

    public Aidman(Long id,String name, Integer age, Integer salary, Integer increase) {
        super(id, name, age, salary);
        this.increase = increase;
    }

    public Aidman() {
        super();
    }

    @Override
    public String toString() {
        return "Aidman{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                ", increase=" + getIncrease() +
                '}';
    }

    public Integer getIncrease() {
        return increase;
    }

    public void setIncrease(Integer increase) {
        this.increase = increase;
    }
}
