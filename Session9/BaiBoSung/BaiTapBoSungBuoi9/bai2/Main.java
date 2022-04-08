package bai2;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng số phức
        TinhToanSoPhuc tinhToan = TinhToanSoPhuc.getInstance();
        // Tạo các đối tượng số phức
        SoPhuc p1 = new SoPhuc(4, 2);
        SoPhuc p2 = new SoPhuc(1, 1);

        // Tính toán
        SoPhuc t = tinhToan.nhan(p1, p2);
        System.out.println(t);

        SoPhuc t1 = tinhToan.chia(p1, p2);
        System.out.println(t1);

        // Tính phép tính
        SoPhuc k = tinhToan.cong(p1, p2, p1);

        // Tính toán phức tạp
        // (p1 + p2) * p1 ???
        SoPhuc z = (p1.cong(p2)).nhan(p1);
        System.out.println(z);

    }
}
