package com.nnt.core.b2;

public class Main {
    public static void main(String[] args) {
        TinhToanSoThuc tinhToanSoThuc = new TinhToanSoThuc();
        double a = 5, b = 6;

        System.out.println(tinhToanSoThuc.cong(a, b));

        TinhToanPhanSo tinhToanPhanSo = new TinhToanPhanSo();
        PhanSo p1 = new PhanSo(4, 5);
        PhanSo p2 = new PhanSo(5, 6);
        PhanSo p3 = new PhanSo(5, 9);
        // Tính toán 1 phép tính phức tạp: (pt1 + pt3) * (pt2 - pt1 * pt3)
        PhanSo t = (p1.cong(p3)).nhan(p2.tru(p1.nhan(p3)));
        System.out.println(t);
    }
}
