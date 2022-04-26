public class Human implements Comparable<Human> {
    private int id;
    private String firstName;
    private String lastName;
    private String city;
    private int gender;
    private int age;
    private int salary;

    public Human() {
    }

    public Human(int id, String firstName, String lastName, String city, int gender, int age, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        String strGender;
        if (gender == 1) strGender = "Nam";
        else strGender = "Nữ";

        return "Human{" +
                "id=" + id +
                ", fullName='" + lastName + " " + firstName + '\'' +
                ", city='" + city + '\'' +
                ", gender=" + strGender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Human o) {
        String thisFullName = lastName + " " + firstName;
        String oFullName = o.lastName + " " + o.firstName;
        return thisFullName.compareTo(oFullName);
    }
}
