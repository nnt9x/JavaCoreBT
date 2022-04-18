package com.nnt.collection;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner cho phép nhập dữ liệu từ bàn phím
        Scanner in = new Scanner(System.in);
        // Tạo đối tượng application
        App app = App.getInstance();

        int option = -1;
        do {
            // Hiển thị menu
            System.out.println("------MENU------");
            System.out.println("1.Danh sách sinh viên");
            System.out.println("2.Nhập thông tin sinh viên");
            System.out.println("3.Tìm kiếm sinh viên theo ID");
            System.out.println("4.Danh sách môn học");
            System.out.println("5.Nhập thông tin môn học mới");
            System.out.println("6.Nhập điểm môn học cho sinh viên");
            System.out.println("7.Cập nhật điểm cho sinh viên");
            System.out.println("8.Xem điểm sinh viên theo mã ID");
            System.out.println("9.In ra danh sách sinh viên theo mã môn học");
            System.out.println("10.In ra sinh viên có điểm trung bình môn cao nhất");
            System.out.println("0. Thoát");
            try {
                System.out.print("Nhập lựa chọn: ");
                option = Integer.parseInt(in.nextLine());
            } catch (Exception e) {
                System.out.printf("Hãy nhập số! Lỗi %s \n", e.getMessage());
                continue;
            }
            // Xử lý khi người dùng lựa chọn
            SinhVien sv = null;
            String maSinhVien = null;

            int diem = -1;
            List<SinhVien> sinhVienList = null;
            List<MonHoc> monHocList = null;

            MonHoc monHoc = null;
            String maMonHoc = null;


            switch (option) {
                case 1:
                    sinhVienList = app.danhSachSinhVien();
                    if (sinhVienList.size() == 0) {
                        System.out.println("Danh sách sinh viên rỗng!");
                        break;
                    }
                    System.out.println("Danh sách sinh viên");
                    for (SinhVien item : sinhVienList) {
                        System.out.println(item);
                    }
                    break;
                case 2:
                    System.out.println("Nhập thông tin sinh viên");
                    sv = new SinhVien();
                    System.out.print("Mã sinh viên: ");
                    sv.setMaSinhVien(in.nextLine());
                    System.out.print("Họ tên: ");
                    sv.setTenSinhVien(in.nextLine());
                    System.out.print("Ngày sinh (YYYY-MM-DD): ");
                    sv.setNgaySinh(in.nextLine());
                    System.out.print("Quê quán: ");
                    sv.setQueQuan(in.nextLine());
                    app.danhSachSinhVien().add(sv);
                    break;
                case 3:
                    System.out.print("Nhập mã sinh viên: ");
                    maSinhVien = in.nextLine();
                    sv = app.timKiemSinhVienTheoID(maSinhVien);
                    if (sv == null) {
                        System.out.println("Không có sinh viên mã " + maSinhVien);
                        break;
                    }
                    System.out.println(sv);
                    break;
                case 4:
                    monHocList = app.danhSachMonHoc();
                    if (monHocList.size() == 0) {
                        System.out.println("Danh sách môn học trống!");
                        break;
                    }
                    for (MonHoc mh : monHocList) {
                        System.out.println(mh);
                    }
                    break;
                case 5:
                    System.out.println("Nhập thông tin môn học: ");
                    monHoc = new MonHoc();
                    System.out.print("Mã môn: ");
                    monHoc.setMaMonHoc(in.nextLine());
                    System.out.print("Tên môn: ");
                    monHoc.setTenMonHoc(in.nextLine());
                    app.danhSachMonHoc().add(monHoc);
                    break;
                case 6:
                    System.out.println("Nhập điểm cho sinh viên");
                    System.out.print("Mã sinh viên: ");
                    maSinhVien = in.nextLine();
                    System.out.print("Mã môn học: ");
                    maMonHoc = in.nextLine();
                    System.out.print("Điểm số [0,100]: ");
                    diem = Integer.parseInt(in.nextLine());
                    app.nhapDiemSinhVien(new Diem(maSinhVien, maMonHoc, diem));
                    break;
                case 7:
                    /*
                    Triển khai tiếp
                     */
                    break;
                case 8:
                    System.out.print("Nhập mã sinh viên: ");
                    List<String> diemSinhVien = app.xemDiemTheoMaSinhVien(in.nextLine());
                    for (String item : diemSinhVien) {
                        System.out.println(item);
                    }
                    break;
                case 9:
                    /*
                    Triển khai tiếp
                     */
                    break;
                case 10:
                    /*
                    Triển khai tiếp
                     */
                    break;
                case 0:
                    System.out.println("Kết thúc chương trình");
                    break;
                default:
                    System.out.println("Vui lòng chọn lại!");
                    break;
            }
        }
        while (option != 0);
        in.close();
    }
}
