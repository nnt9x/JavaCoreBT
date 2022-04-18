package com.nnt.collection;

import java.util.List;

/*
Các chức năng chính của Application
 */
public interface IApp {
    // Lấy danh sách sinh viên
    public List<SinhVien> danhSachSinhVien();

    // Thêm 1 sinh viên vào danh sách
    public boolean themSinhVien(SinhVien sinhVien);

    // Tìm kiếm sinh viên theo ID
    public SinhVien timKiemSinhVienTheoID(String maSinhVien);

    // Danh sách môn học
    public List<MonHoc> danhSachMonHoc();

    // Nhập thông tin một môn học mới
    public boolean themMonHoc(MonHoc monHoc);

    // Tìm kiếm môn học theo mã môn
    public MonHoc timMonHocTheoMaMon(String maMon);

    // Nhập điểm cho sinh viên
    public boolean nhapDiemSinhVien(Diem diem);

    // Cập nhật điểm cho sinh viên
    public boolean capNhatDiem(String maSinhVien, String maMon, int diemSo);

    // Xem điểm sinh viên theo mã ID
    public List<String> xemDiemTheoMaSinhVien(String maSinhVien);

    // In ra danh sách sinh viên theo mã môn học
    public List<SinhVien> danhSachSinhVienTheoMon(String maMonHoc);

    // Tính điểm trung bình môn của một sinh viên
    public double diemTrungBinhMonCuaSinhVien(String maSinhVien);

    // Sinh viên có điểm trung bình môn cao nhất
    public SinhVien sinhVienCoDiemTrungBinhMonCaoNhat();
}
