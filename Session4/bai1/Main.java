package bai1;

public class Main {
    public static void main(String[] args) {
        // Phân số 1:  3/4
        PhanSo ps1 = new PhanSo(3, 4);
        // Phân số 2:  4/5
        PhanSo ps2 = new PhanSo(4, 5);
        System.out.printf("Tổng: %s \n", TinhToan.tong(ps1, ps2).toString());
        System.out.printf("Thương: %s \n ", TinhToan.thuong(ps1, ps2).toString());

        // Phân số 3: 0/4
        PhanSo ps3 = new PhanSo(0, 4);
        System.out.printf("Thương: %s \n ", TinhToan.thuong(ps1, ps3).toString());

    }
}
