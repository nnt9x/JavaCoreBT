package main;

import qldc.HoDan;
import qldc.KhuPho;
import qldc.ThanhVien;

public class App {
    public static void main(String[] args) {
        // Tạo khu phố
        KhuPho khuPho = new KhuPho();
        khuPho.setTenKhuPho("Tạ Quang Bửu");

        // Thêm thành viên và hộ dân
        HoDan hoDan1 = new HoDan("A17","17 Tạ Quang Bửu");
        hoDan1.themThanhVien(new ThanhVien("Con trai 1",20, "Sinh viên","02933939"));
        hoDan1.themThanhVien(new ThanhVien("Bố 1",45, "Kinh doanh","02933940"));
        hoDan1.themThanhVien(new ThanhVien("Mẹ 1",40, "Kinh doanh","02933941"));


        HoDan hoDan2 = new HoDan("A15","15 Tạ Quang Bửu");
        hoDan2.themThanhVien(new ThanhVien("Con gái 2",25, "Văn phòng","03133939"));
        hoDan2.themThanhVien(new ThanhVien("Bố 2",50, "Kinh doanh","03433940"));
        hoDan2.themThanhVien(new ThanhVien("Mẹ 2",45, "Kinh doan","02956941"));

        // Thêm hộ dân vào khu phố
        khuPho.themHoDan(hoDan1);
        khuPho.themHoDan(hoDan2);

        // In ra danh sách
        khuPho.thongTinKhuPho();
    }
}
