package bai3;

public class TamGiac extends DaGiac {

    public TamGiac(double[] arrCanh) {
        super(arrCanh);
        if (arrCanh.length != 3) {
            throw new IllegalArgumentException("Sai kích thước mảng cạnh");
        }
    }

    @Override
    public double tinhChuVi() {
        double a = arrCanh[0];
        double b = arrCanh[1];
        double c = arrCanh[2];
        if (a + b > c && b + c > a && a + c > b) {
            return super.tinhChuVi();
        }
        return -1;
    }

    public double tinhDienTich() {
        double a = arrCanh[0];
        double b = arrCanh[1];
        double c = arrCanh[2];
        if (a + b > c && b + c > a && a + c > b) {
            double p = (a + b + c) / 2;
            double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            return S;
        }
        return -1;
    }

}
