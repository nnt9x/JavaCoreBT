package com.nnt.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App implements IApp {
    private static App app = null;
    // Danh sách
    private List<SinhVien> sinhVienList;
    private List<MonHoc> monHocList;
    private List<Diem> diemList;

    // Khoá không cho tạo đối tượng bên ngoài App
    private App() {
        sinhVienList = new ArrayList<>();
        monHocList = new ArrayList<>();
        diemList = new ArrayList<>();
    }

    // Tạo phương tĩnh để tạo đối tượng
    public static App getInstance() {
        if (app == null) app = new App();
        return app;
    }

    // Lấy ra danh sách sinh viên
    @Override
    public List<SinhVien> danhSachSinhVien() {
        return sinhVienList;
    }

    // Thêm sinh viên vào danh sách sinh viên
    @Override
    public boolean themSinhVien(SinhVien sinhVien) {
        return sinhVienList.add(sinhVien);
    }

    // Tìm kiếm sinh viên theo ID
    @Override
    public SinhVien timKiemSinhVienTheoID(String maSinhVien) {
        for (SinhVien sv : sinhVienList) {
            if (sv.getMaSinhVien().equals(maSinhVien)) {
                return sv;
            }
        }
        return null;
    }

    // Lấy danh sách môn học
    @Override
    public List<MonHoc> danhSachMonHoc() {
        return monHocList;
    }

    // Thêm môn học mới vào danh sách
    @Override
    public boolean themMonHoc(MonHoc monHoc) {
        return monHocList.add(monHoc);
    }

    @Override
    public MonHoc timMonHocTheoMaMon(String maMon) {
        for (MonHoc mh : monHocList) {
            if (mh.getMaMonHoc().equals(maMon)) {
                return mh;
            }
        }
        return null;
    }

    // Nhập điểm cho sinh viên
    @Override
    public boolean nhapDiemSinhVien(Diem diem) {
        // Check xem có mã môn học và sinh viên đó hay không nữa!
        String maSinhVien = diem.getMaSinhVien();
        String maMonHoc = diem.getMaMonHoc();

        MonHoc mh = timMonHocTheoMaMon(maMonHoc);
        if (mh == null) {
            throw new RuntimeException("Không có môn học mã " + maMonHoc);
        }
        SinhVien sv = timKiemSinhVienTheoID(maSinhVien);
        if (sv == null) {
            throw new RuntimeException("Không có sinh viên mã " + maSinhVien);
        }
        return diemList.add(diem);
    }

    @Override
    public boolean capNhatDiem(String maSinhVien, String maMonHoc, int diemSo) {
        // Lấy ra điểm chứa thông tin gồm mã sinh viên và mã môn học
        Diem tmp = null;
        for (Diem d : diemList) {
            if (d.getMaMonHoc().equals(maMonHoc) && d.getMaSinhVien().equals(maSinhVien)) {
                tmp = d;
                break;
            }
        }
        if (tmp == null) {
            throw new RuntimeException("Mã sinh viên hoặc mã môn không hợp lệ!");
        }
        if (diemSo < 0 || diemSo > 100) {
            throw new RuntimeException("Điểm số không hợp lệ!");
        }
        tmp.setDiemSo(diemSo);
        return true;
    }


    @Override
    public List<String> xemDiemTheoMaSinhVien(String maSinhVien) {
        // Kiểm tra sinh viên đó có hay không
        SinhVien tmp = null;
        for (SinhVien sv : sinhVienList) {
            if (sv.getMaSinhVien().equals(maSinhVien)) {
                tmp = sv;
                break;
            }
        }
        if (tmp == null) {
            throw new RuntimeException("Không có sinh viên mã " + maSinhVien);
        }
        // Xem điểm của sinh viên
        // Mã môn - tên môn - Điểm số
        List<String> diemSos = new ArrayList<>();
        for (Diem d : diemList) {
            if (d.getMaSinhVien().equals(maSinhVien)) {
                MonHoc monHoc = timMonHocTheoMaMon(d.getMaMonHoc());
                String str = String.format("Mã môn %s, tên môn %s, điểm số %d", d.getMaMonHoc(), monHoc.getTenMonHoc(), d.getDiemSo());
                diemSos.add(str);
            }
        }
        return diemSos;
    }


    @Override
    public List<SinhVien> danhSachSinhVienTheoMon(String maMonHoc) {
        // Kiểm tra xem có mã môn học đó trước không ?
        MonHoc monHoc = timMonHocTheoMaMon(maMonHoc);
        if (monHoc == null) {
            throw new RuntimeException("Không có môn học mã " + maMonHoc);
        }
        List<SinhVien> sinhViens = new ArrayList<>();
        // Duyệt list điểm số lấy ra id của tất cả sinh viên. -> từ id tìm ra sinh viên
        for (SinhVien sv : sinhVienList) {
            for (Diem d : diemList) {
                if (sv.getMaSinhVien() == d.getMaSinhVien()) {
                    sinhViens.add(sv);
                }
            }
        }
        return sinhViens;
    }

    @Override
    public double diemTrungBinhMonCuaSinhVien(String maSinhVien) {
        SinhVien sv = timKiemSinhVienTheoID(maSinhVien);
        if (sv == null) {
            throw new RuntimeException("Không có sinh viên mã " + maSinhVien);
        }
        double t = 0;
        int count = 0;
        for (Diem d : diemList) {
            if (d.getMaSinhVien().equals(maSinhVien)) {
                t += d.getDiemSo();
                count++;
            }
        }
        return t / count;
    }

    @Override
    public SinhVien sinhVienCoDiemTrungBinhMonCaoNhat() {
        // Lấy lấy ra thông tin điểm trung bình của

        // Lọc ra danh sách ID không trùng lặp
        Set<String> ids = new HashSet<>();
        for (Diem d : diemList) {
            ids.add(d.getMaSinhVien());
        }

        List<String> maSinhViens = new ArrayList<>(ids);

        // Tính điểm trung bình môn cho từng sinh viên
        String maSinhVienMax = maSinhViens.get(0);
        double max = diemTrungBinhMonCuaSinhVien(maSinhVienMax);

        for (int i = 1; i < maSinhViens.size(); i++) {
            double tmp = diemTrungBinhMonCuaSinhVien(maSinhViens.get(i));
            if (tmp > max) {
                max = tmp;
                maSinhVienMax = maSinhViens.get(i);
            }
        }

        return timKiemSinhVienTheoID(maSinhVienMax);
    }
}
