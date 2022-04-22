import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        // Faker tạo 1000 sinh viên
        Faker faker = new Faker(new Locale("vi", "VN"));
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            Student s = new Student();
            s.setId(i);
            s.setFullName(faker.name().fullName());
            s.setMark(faker.number().numberBetween(0, 101));
            s.setAge(faker.number().numberBetween(18, 25));
            s.setGender(faker.number().numberBetween(0, 2)); // [0, 2) -> [0, 1]
            s.setCountry(faker.country().name());
            studentList.add(s);
        }
        System.out.println(studentList);

        // Thực hiện
        long soSvNam = studentList.stream().filter(item -> item.getGender() == 1).count();
        System.out.println("Số lượng sinh viên nam là " + soSvNam);

        // số nữ trên 20 tuổi, điểm hơn 50
        long soSvNu = studentList.stream()
                .filter(item -> item.getGender() == 0)
                .filter(item -> item.getMark() > 50)
                .filter(item -> item.getAge() > 20)
                .count();
        System.out.println(soSvNu);

        // nam trên 19 bắt đầu bằng A
        long soNam = studentList.stream()
                .filter(s -> s.getGender() == 1)
                .filter(s -> s.getAge() >= 19)
                .filter(s -> s.getFullName().startsWith("A"))
                .count();
        System.out.println("Số nam: " + soNam);

        // contry - List<student>
        Map<String, List<Student>> map = studentList
                .stream()
                .collect(Collectors.groupingBy(student -> student.getCountry()));

        // Danh sách sinh viên theo nước
        for (Map.Entry<String, List<Student>> entry : map.entrySet()) {
            System.out.println("Country " + entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
