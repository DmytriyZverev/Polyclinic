package domain;

public class Nurse extends Personnel {
    private String profile;

    public Nurse(String name, Integer age, Integer salary, String profile) {
        super(name, age, salary);
        this.profile = profile;
    }

    public Nurse() {
        super();
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
}
