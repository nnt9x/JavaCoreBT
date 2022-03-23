package bai1;

public class HinhChuNhat {
    // Thuộc tính
    double chieuDai;
    double chieuRong;

    // Constructor
    public HinhChuNhat() {

    }

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    // Setter và getter

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public double chuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    public double dienTich() {
        return chieuRong * chieuRong;
    }

    @Override
    public String toString() {
        return String.format("HinhChuNhat[chieuDai=%.2f cm, chieuRong=%.2f cm, chuVi=%.2f cm, dienTich=%.2f cm2]",
                chieuDai, chieuDai, chuVi(), dienTich());
    }

}
