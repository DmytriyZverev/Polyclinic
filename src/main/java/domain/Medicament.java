package domain;

import annotation.FileStorage;

@FileStorage(name = "Medicament")
public class Medicament extends BaseEntity{

    private String name;
    private Integer count;
    private Double price;

    public Medicament() {

    }

    public Medicament(Long id, String name, Integer count, Double price) {
        super(id);
        this.name = name;
        this.count = count;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Medicament{" +
                "id=" + getId() +
                " name='" + getName() + '\'' +
                ", count='" + getCount() + '\'' +
                ", price=" + getPrice() +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        if (count < 0) {
            throw new IllegalArgumentException("Count cannot be less than zero!");
        }
        this.count = count;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be less than zero!");
        }
        this.price = price;
    }
}
