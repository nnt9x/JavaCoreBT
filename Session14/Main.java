import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.function.IntUnaryOperator;

public class Main {
    public static void main(String[] args) {
        // Danh sách các số nguyên
        int[] daySo = {1, 2, 5, -5, 0, 7, 8, 10, 9, 20, -4, 6, 7, 30, 40};

        // In ra danh sách các số có trong dãy
        Arrays.stream(daySo).forEach(new IntConsumer() {
            @Override
            public void accept(int value) {
                System.out.print(value + "\t");
            }
        });
        System.out.println();
        // In ra các số dương (lớn hơn 0).
        Arrays.stream(daySo).filter(i -> i > 0).forEach(i -> System.out.print(i + "\t"));

        System.out.println();
        // Đếm các số âm trong dãy
        // C1: thông thường
        int count = 0;
        for (int i : daySo) {
            if (i < 0) count++;
        }
        System.out.printf("Có %d số âm \n", count);
        // C2: sử dungk stream api: dãy -> stream -> lọc (< 0) -> đếm
        long count1 = Arrays.stream(daySo).filter(i -> i < 0).count();
        System.out.printf("Có %d số âm \n", count1);

        // In ra tất cả các số dương, và là số chẵn
        // Dãy -> stream -> filter 1: > 0 -> filter 2: kiem tra chan -> in ra
        Arrays.stream(daySo).filter(i -> i > 0).filter(i -> i % 2 == 0).
                forEach(i -> System.out.print(i + "\t"));
        System.out.println();

        // Tạo ra 1 dãy số mới, giả sử dãy ban đầu tên là x
        // Dãy mới, mỗi phần tử trong y = 2x + 1
        // VD: 1, 2, 5, -5, 0, 7, 8, 10, 9, 20, -4, 6, 7, 30, 40
        // Tạo danh sách mới 3, 5, 11....
        
        Arrays.stream(daySo).map(new IntUnaryOperator() {
            @Override
            public int applyAsInt(int operand) {
                return operand * 2 + 1;
            }
        }).forEach(i -> System.out.print(i + "\t"));


    }
}
