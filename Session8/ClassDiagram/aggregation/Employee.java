package aggregation;

import java.util.List;

/*
Aggregation in terms of objects refers to "has a"+ relationship between two related objects.
 */
public class Employee {
    private String name;
    private int age;
    private boolean gender;
    private List<EAddress> EAddresses;

    public Employee(){
        super();
    }

    public Employee(String name, int age, boolean gender, List<EAddress> EAddresses) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.EAddresses = EAddresses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public List<EAddress> getEAddresses() {
        return EAddresses;
    }

    public void setEAddresses(List<EAddress> EAddresses) {
        this.EAddresses = EAddresses;
    }
}
