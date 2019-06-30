package domain;

public class Aidman extends Personnel {
    private Integer increase;

    public Aidman(String name, Integer age, Integer salary, Integer increase) {
        super(name, age, salary);
        this.increase = increase;
    }

    public Aidman() {
        super();
    }

    public Integer getIncrease() {
        return increase;
    }

    public void setIncrease(Integer increase) {
        this.increase = increase;
    }
}
