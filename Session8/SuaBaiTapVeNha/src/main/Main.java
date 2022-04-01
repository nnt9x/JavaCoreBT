package main;

import qldc.HoDan;
import qldc.KhuPho;
import qldc.ThanhVien;

import java.util.Scanner;

public class Main {

    private static void showMenu() {
        System.out.println("------Quan Ly Khu Pho-------");
        System.out.println("1. Thêm hộ dân: ");
        System.out.println("2. In ra thông tin tất cả hộ dân");
        System.out.println("3. In ra thông tin hộ dân theo số nhà");
        System.out.println("4. Tìm người theo CCCD");
        System.out.println("5. Thoát");
        System.out.print("\nNhập lựa chọn: ");
    }


    public static void main(String[] args) {
        int select = 0;
        Scanner in = new Scanner(System.in);
        // Tạo khu khố
        KhuPho khuPho = new KhuPho();
        khuPho.setTenKhuPho("Tạ Quang Bửu");
        do {
            showMenu();
            select = Integer.parseInt(in.nextLine());
            String soNha;
            HoDan hoDan;
            switch (select) {
                case 1:
                    System.out.print("Nhập số nhà: ");
                    soNha = in.nextLine();
                    System.out.print("Nhập địa chỉ: ");
                    String diaChi = in.nextLine();
                    // Tạo hộ dân
                    hoDan = new HoDan(soNha, diaChi);
                    // Nhập thành viên
                    System.out.print("Nhập số lượng thành viên: ");
                    int soLuong = Integer.parseInt(in.nextLine());
                    // Lặp để nhập từng thành viên
                    for (int i = 0; i < soLuong; i++) {
                        System.out.println("-----------------------------------------");
                        System.out.printf("Thành viên thứ %d\n", i + 1);
                        System.out.print("Họ tên: ");
                        String hoTen = in.nextLine();
                        System.out.print("Tuổi: ");
                        int tuoi = Integer.parseInt(in.nextLine());
                        System.out.print("Nghề nghiệp: ");
                        String ngheNghiep = in.nextLine();
                        System.out.print("Số cccd: ");
                        String cccd = in.nextLine();
                        // Thêm thành viên vào hộ dân
                        hoDan.themThanhVien(new ThanhVien(hoTen, tuoi, ngheNghiep, cccd));
                    }
                    // Thêm hộ dân
                    khuPho.themHoDan(hoDan);

                    break;
                case 2:
                    khuPho.thongTinKhuPho();
                    break;
                case 3:
                    System.out.print("Nhập số nhà: ");
                    soNha = in.nextLine();
                    hoDan = khuPho.timHoDanTheoSoNha(soNha);
                    if (hoDan == null) System.out.printf("Không có số nhà %s \n", soNha);
                    else hoDan.thongTinHoDan();
                    break;
                case 4:
                    System.out.print("Nhập số CCCD: ");
                    String cccd = in.nextLine();
                    ThanhVien thanhVien = null;
                    String sNha = null, dChi = null;

                    for (HoDan hd : khuPho.getDanhSachHoDan()) {
                        thanhVien = hd.timThanhVien(cccd);
                        if (thanhVien != null) {
                            sNha = hd.getSoNha();
                            dChi = hd.getDiaChi();
                            break;
                        }
                    }
                    if (thanhVien == null) {
                        System.out.printf("Không có người có số cccd %s trong khu phố %s \n", cccd, khuPho.getTenKhuPho());
                    } else {
                        System.out.printf("Số nhà %s, địa chỉ %s\n", sNha, dChi);
                        System.out.println(thanhVien.toString());
                    }
                    break;
                case 5:
                    System.out.println("Kết thúc");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }
        }
        while (select != 5);
        in.close();
    }
}
