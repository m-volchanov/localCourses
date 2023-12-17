package homeworks.homework31;

public class CreateUserRequestPojo {
    private String name;
    private String job;

    public CreateUserRequestPojo(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public CreateUserRequestPojo() {
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
