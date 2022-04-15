package com.nnt.core.b1;

public class HinhVuong implements IHinhHoc {
    // Mặc định cạnh bằng 1.0
    private double canh = 1.0;

    public HinhVuong() {
    }

    public HinhVuong(double canh) {
        if (canh <= 0) {
            throw new IllegalArgumentException("Canh phai duong!");
        }
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        if (canh <= 0) {
            throw new IllegalArgumentException("Canh phai duong!");
        }
        this.canh = canh;
    }

    @Override
    public double tinhChuVi() {
        return canh * 4;
    }

    @Override
    public double tinhDienTich() {
        return canh * canh;
    }

    @Override
    public String toString() {
        return "HinhVuong[" + "canh=" + canh + ']';
    }
}
