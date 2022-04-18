package com.nnt.collection;

public class SinhVien {
    private String maSinhVien;
    private String tenSinhVien;
    private String ngaySinh;
    private String queQuan;

    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String tenSinhVien, String ngaySinh, String queQuan) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    @Override
    public String toString() {
        return "SinhVien[" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", tenSinhVien='" + tenSinhVien + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", queQuan='" + queQuan + '\'' +
                ']';
    }
}
