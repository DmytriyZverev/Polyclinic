package domain;

import annotation.FileStorage;

@FileStorage(name = "Nurse")
public class Nurse extends Personnel {
    private String profile;

    public Nurse(Long id, String name, Integer age, Integer salary, String profile) {
        super(id, name, age, salary);
        this.profile = profile;
    }

    public Nurse() {
        super();
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                ", profile='" + getProfile() +
                '}';
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
}
