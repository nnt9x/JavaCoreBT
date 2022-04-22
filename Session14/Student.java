public class Student {
    private int id;
    private String fullName;
    private int age;
    private int mark;
    private int gender;
    private String country;

    public Student(int id, String fullName, int age, int mark, int gender, String country) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.mark = mark;
        this.gender = gender;
        this.country = country;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", mark=" + mark +
                ", gender=" + gender +
                ", country='" + country + '\'' +
                '}';
    }
}
