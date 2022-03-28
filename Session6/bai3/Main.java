package bai3;

public class Main {
    public static void main(String[] args) {
        TamGiac tamGiac = new TamGiac(new double[]{3.0, 4.0, 5.0});
        System.out.printf("Chu vi %.2f cm, dien tich %.2f cm2 \n", tamGiac.tinhChuVi(), tamGiac.tinhDienTich());
    }
}
