package bai3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ThuVien thuVien = new ThuVien();
        // Thêm dữ liệu
        Bao bao1 = new Bao("Báo 1","BK",1000, LocalDate.now());
        Bao bao2 = new Bao("Báo 2","Báo mới",5000, LocalDate.of(2020,10,27));
        thuVien.nhapTaiLieu(bao1);
        thuVien.nhapTaiLieu(bao2);

        Sach sach1 = new Sach("Sách 1", "HN", 100, "BGD",200,50000);
        thuVien.nhapTaiLieu(sach1);

        TapChi tapChi1 = new TapChi("Tạp chí 1","Thanh niên", 4000, 8);
        thuVien.nhapTaiLieu(tapChi1);

        // Hiển thị thông tin
        thuVien.hienThiTaiLieu();
        thuVien.hienThiTaiLieuTheoLoai(ThuVien.LoaiTaiLieu.SACH);


    }
}
