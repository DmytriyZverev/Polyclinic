package domain;

public class Equipment {

    private Integer id;

    private String function;

    public Equipment(){

    }

    public Equipment(Integer id, String function) {
        this.id = id;
        this.function = function;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }
}
