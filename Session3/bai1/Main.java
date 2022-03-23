package bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Tạo hình chữ nhật đầy đủ tham số
        HinhChuNhat hcn1 = new HinhChuNhat(4, 5);
        System.out.println(hcn1.toString());

        // Nhập dữ liệu từ bàn phím
        HinhChuNhat hcn2 = new HinhChuNhat();
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        hcn2.setChieuDai(Double.parseDouble(in.nextLine()));
        System.out.print("Nhập chiều rộng: ");
        hcn2.setChieuRong(Double.parseDouble(in.nextLine()));
        System.out.println(hcn2.toString());
        in.close();

    }
}
