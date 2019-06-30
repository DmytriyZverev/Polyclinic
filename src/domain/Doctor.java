package domain;

public class Doctor extends Personnel {
    private String specialty;

    public Doctor(String name, Integer age, Integer salary, String specialty) {
        super(name, age, salary);
        this.specialty = specialty;
    }

    public Doctor() {
        super();
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
