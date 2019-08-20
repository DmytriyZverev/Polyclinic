package domain;

import annotation.FileStorage;

@FileStorage(name = "Doctor")
public class Doctor extends Personnel {
    private String specialty;

    public Doctor(Long id, String name, Integer age, Integer salary, String specialty) {
        super(id, name, age, salary);
        this.specialty = specialty;
    }

    public Doctor() {
        super();
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                ", specialty='" + getSpecialty() +
                '}';
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
