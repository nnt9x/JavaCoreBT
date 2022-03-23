package bai3;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Van A", "Nguyen", 1000);
        System.out.println(e1);
        e1.raiseSalary(10);
        System.out.println(e1);
    }
}
