package bai2;

public class Main {
    public static void main(String[] args) {
        Staff staff = new Staff("Staff 1", "HN","BKACAD",1000);
        System.out.println(staff);

        Student student = new Student("Student 1", "HN", "Computing",2022, 1000);
        System.out.println(student);
    }
}
