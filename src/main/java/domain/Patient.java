package domain;

import annotation.FileStorage;

@FileStorage(name = "Patient")
public class Patient extends BaseEntity{

    private String name;
    private Integer age;
    private String disease;

    public Patient(){

    }

    public Patient(Long id, String name,Integer age, String disease) {
        super(id);
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + getId() +
                " name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", disease='" + getDisease() + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
}
