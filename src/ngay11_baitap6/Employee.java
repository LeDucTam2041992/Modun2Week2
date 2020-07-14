package ngay11_baitap6;

public class Employee {
    private String name;
    private String gender;
    private String birthday;

    public Employee() {
    }

    public Employee(String name, String gender, String birthday) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "name = " + name + '\t' +
                ", gender = " + gender + '\t' +
                ", birthday = " + birthday;

    }
}
