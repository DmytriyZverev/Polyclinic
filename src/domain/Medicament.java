package domain;

public class Medicament {

    private String group;

    private String form;

    private Double price;

    public Medicament() {

    }

    public Medicament(String group, String form, Double price) {
        this.group = group;
        this.form = form;
        this.price = price;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
