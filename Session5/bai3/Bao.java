package bai3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Bao extends TaiLieu{
    private LocalDate ngayPhatHanh;

    public Bao() {
       super();
    }

    public Bao(String maTaiLieu, String tenNhaXuatBan, long soBanPhatHanh, LocalDate localDate) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = localDate;
    }

    public LocalDate getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(LocalDate ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "Bao[" + super.toString() +
                ", ngayPhatHanh=" + ngayPhatHanh.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) +
                ']';
    }
}
