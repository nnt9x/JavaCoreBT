package com.nnt.core.b1;

public class HinhTron implements IHinhHoc {
    // Mặc định bán kính bằng 1.0
    public double r = 1.0;

    public HinhTron() {
    }

    public HinhTron(double r) {
        if (r <= 0) {
            throw new IllegalArgumentException("Ban kinh phai duong!");
        }
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        if (r <= 0) {
            throw new IllegalArgumentException("Ban kinh phai duong!");
        }
        this.r = r;
    }

    @Override
    public String toString() {
        return "HinhTron[" +
                "r=" + r +
                ']';
    }

    @Override
    public double tinhChuVi() {
        double cv = Math.PI * 2 * r;
        return cv;
    }

    @Override
    public double tinhDienTich() {
        double dt = Math.PI * r * r;
        return dt;
    }
}
