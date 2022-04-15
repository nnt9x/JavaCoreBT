package com.nnt.core.b1;

public class Main {
    public static void main(String[] args) {
        Drawable drawable = new Drawable();
        HinhTron ht = new HinhTron(4);
        HinhVuong hv = new HinhVuong(5);
        HinhChuNhat hcn = new HinhChuNhat(4, 5);
        drawable.draw(ht);
        drawable.draw(hv);
    }
}
