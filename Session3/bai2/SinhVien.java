package bai2;

public class SinhVien {
    private String maSinhVien;
    private String hoTen;
    private double diemLT;
    private double diemTH;

    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String hoTen, double diemLT, double diemTH) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(double diemLT) {
        this.diemLT = diemLT;
    }

    public double getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(double diemTH) {
        this.diemTH = diemTH;
    }

    public double diemTrungBinh() {
        return (diemLT + diemTH) / 2;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", diemLT=" + diemLT +
                ", diemTH=" + diemTH +
                ", diemTB=" + diemTrungBinh() +
                '}';
    }
}
