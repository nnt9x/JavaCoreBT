import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Fake 1000 đối tượng
        Faker faker = new Faker(new Locale("vi", "VN"));
        List<Human> humanList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            Human human = new Human();
            human.setId(i);
            human.setFirstName(faker.name().firstName());
            human.setLastName(faker.name().lastName());
            human.setAge(faker.number().numberBetween(10, 51));
            human.setCity(faker.address().cityName());
            human.setSalary(faker.number().numberBetween(10, 3001));
            human.setGender(faker.number().numberBetween(0, 2));
            humanList.add(human);
        }
        // a. Có bao nhiêu nam trên 18 tuổi
        long soNamTren18 = humanList.stream()
                .filter(h -> h.getGender() == 1)
                .filter(h -> h.getAge() > 18)
                .count();
        System.out.println("Số nam trên 18" + soNamTren18);

        // b. Không tìm ra dc thị.
        // c. Lọc ra những người họ “Nguyễn” và sắp xếp theo thứ tự chữ cái.
        List<Human> listHoNguyen = humanList.stream()
                .filter(h -> h.getLastName().equalsIgnoreCase("Nguyễn"))
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Danh sách họ Nguyễn: ");
        for (Human h : listHoNguyen) {
            System.out.println(h);
        }
        // d. In ra người 20 -30
        humanList.stream()
                .filter(h -> h.getAge() >= 20 && h.getAge() <= 30)
                .forEach(h -> System.out.println(h));
        // e. Lấy ra danh sách thành phố -> đếm
        List<String> listThanhPho = humanList.stream()
                .map(h -> h.getCity())
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Tổng thành phố: " + listThanhPho.size());


        // f. Lấy ra 10 người đầu tiên
        List<Human> humansTop10 = humanList.stream().limit(10)
                .collect(Collectors.toList());
        System.out.println(humansTop10);

        // g. Tính độ tuổi trung bình
        double tuoiTrungBinh = humanList.stream()
                .collect(Collectors.averagingDouble(h -> h.getAge()));
        System.out.println(tuoiTrungBinh);

        // h. tính mức lương trung bình của nam ở độ tuổi từ 20-40
        double luongTrungBinh = humanList.stream()
                .filter(h -> h.getGender() == 1)
                .filter(h -> h.getAge() >= 20 && h.getAge() <= 40)
                .collect(Collectors.averagingDouble(h -> h.getSalary()));
        System.out.println("Lương trung bình là " + luongTrungBinh);

        // i. Sắp xếp danh sách theo độ tuổi.
        humanList.stream()
                .sorted((o1, o2) -> {
                            if (o1.getAge() > o2.getAge()) return 1;
                            else if (o1.getAge() == o2.getAge()) return 0;
                            return -1;
                        }
                )
                .forEach(h -> System.out.println(h));
        // In danh sách theo city - list (GROUP BY )
        // 1 thành phố -> N người  Map(KEY, VALUE) -> MAP(city, List<Human>)

        Map<String, List<Human>> listHumansByCity =
                humanList.stream()
                        .collect(Collectors.groupingBy(h -> h.getCity()));

        for (Map.Entry<String, List<Human>> entry : listHumansByCity.entrySet()) {
            System.out.println("Thành phố: " + entry.getKey());
            entry.getValue().stream().forEach(e -> System.out.println(e));
        }
    }
}
