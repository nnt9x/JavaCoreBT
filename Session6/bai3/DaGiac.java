package bai3;

import java.util.Arrays;

public abstract class DaGiac {
    protected double[] arrCanh;

    public DaGiac(double[] arrCanh) {
        this.arrCanh = arrCanh;
    }

    public double tinhChuVi() {
        double t = 0;
        for (double canh : arrCanh) {
            t += canh;
        }
        return t;
    }

    public void inCanh() {
        System.out.println("Cạnh: " + Arrays.toString(arrCanh));
    }
}
