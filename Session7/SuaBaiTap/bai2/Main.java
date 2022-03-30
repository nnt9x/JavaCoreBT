package bai2;

public class Main {
    public static void main(String[] args) {
        // Tạo hình bình hành và hình chữ nhật qua Interface HinhHoc2D
        HinhHoc2D hinhBinhHanh = new HinhBinhHanh(4, 5, 30);
        System.out.println(hinhBinhHanh);
        System.out.printf("Chu vi %.2f cm, diện tích %.2f cm2 \n",hinhBinhHanh.tinhChuVi(), hinhBinhHanh.tinhDienTich());
        System.out.println("----------------------");

        HinhHoc2D hinhChuNhat = new HinhChuNhat(4, 5);
        System.out.println(hinhChuNhat);
        System.out.printf("Chu vi %.2f cm, diện tích %.2f cm2 \n",hinhChuNhat.tinhChuVi(), hinhChuNhat.tinhDienTich());
        System.out.println("----------------------");

        // Tạo hình tròn
        HinhTron hinhTron = new HinhTron(10);
        System.out.println(hinhTron);
        System.out.printf("Chu vi %.2f cm, diện tích %.2f cm2 \n", hinhTron.tinhChuVi(), hinhTron.tinhDienTich());
        System.out.println("----------------------");

        // Hình trụ
        HinhTru hinhTru1 = new HinhTru(4, 5);
        System.out.println("Hình trụ 1: \n" + hinhTru1);
        System.out.printf("Thể tích %.2f cm3 \n", hinhTru1.tinhTheTich());
        System.out.println("----------------------");


        HinhTru hinhTru2 = new HinhTru(5, hinhTron);
        System.out.println("Hình trụ 2: \n" + hinhTru2);
        System.out.printf("Thể tích %.2f cm3 \n", hinhTru2.tinhTheTich());
        System.out.println("----------------------");


    }
}
