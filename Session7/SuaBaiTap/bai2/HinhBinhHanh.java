package bai2;

public class HinhBinhHanh implements HinhHoc2D {

    private double canhDay;
    private double canhBen;
    private double goc;

    public HinhBinhHanh(double canhDay, double canhBen, double goc) {
        this.canhDay = canhDay;
        this.canhBen = canhBen;
        this.goc = goc;
    }

    public double getCanhDay() {
        return canhDay;
    }

    public void setCanhDay(double canhDay) {
        this.canhDay = canhDay;
    }

    public double getCanhBen() {
        return canhBen;
    }

    public void setCanhBen(double canhBen) {
        this.canhBen = canhBen;
    }

    public double getGoc() {
        return goc;
    }

    public void setGoc(double goc) {
        this.goc = goc;
    }

    @Override
    public double tinhChuVi() {
        return (canhBen + canhDay) * 2;
    }

    @Override
    public double tinhDienTich() {
        return canhBen * Math.sin(Math.toRadians(goc)) * canhDay;
    }

    @Override
    public String toString() {
        return "HinhBinhHanh[" +
                "canhDay=" + canhDay +
                ", canhBen=" + canhBen +
                ", goc=" + goc +
                ']';
    }
}
