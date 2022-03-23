package bai3;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Sach extends TaiLieu {
    private String tenTacGia;
    private int soTrang;
    private double gia;

    public Sach() {
        super();
    }

    public Sach(String maTaiLieu, String tenNhaXuatBan, long soBanPhatHanh, String tenTacGia, int soTrang, double gia) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
        this.gia = gia;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        NumberFormat vndFormat = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
        return "Sach[" + super.toString() +
                ", tenTacGia='" + tenTacGia + '\'' +
                ", soTrang=" + soTrang +
                ", gia=" + vndFormat.format(gia) +
                ']';
    }
}
