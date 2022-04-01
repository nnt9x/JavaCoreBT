package qldc;

import java.util.ArrayList;
import java.util.List;

public class HoDan implements IHoDan {
    private String soNha;
    private String diaChi;
    private final List<ThanhVien> danhSachThanhVien;

    public HoDan() {
        // Tạo danh sách thành viên rỗng
        this.danhSachThanhVien = new ArrayList<>();
    }

    public HoDan(String soNha, String diaChi) {
        this.soNha = soNha;
        this.diaChi = diaChi;
        this.danhSachThanhVien = new ArrayList<>();
    }

    public HoDan(String soNha, String diaChi, List<ThanhVien> danhSachThanhVien) {
        this.soNha = soNha;
        this.diaChi = diaChi;
        this.danhSachThanhVien = danhSachThanhVien;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public List<ThanhVien> getDanhSachThanhVien() {
        return danhSachThanhVien;
    }

    @Override
    public void themThanhVien(ThanhVien thanhVien) {
        danhSachThanhVien.add(thanhVien);
    }

    @Override
    public void xoaThanhVien(ThanhVien thanhVien) {
        danhSachThanhVien.remove(thanhVien);
    }

    @Override
    public void xoaThanhVien(String cccd) {
        boolean flag = false;
        for (ThanhVien tv : danhSachThanhVien) {
            if (tv.getCccd().equals(cccd)) {
                danhSachThanhVien.remove(tv);
                flag = true;
                return;
            }
        }
        if(!flag) System.out.println("Không có thành viên có số căn cước " + cccd);
    }

    @Override
    public void thongTinHoDan() {
        int n = danhSachThanhVien.size();
        System.out.printf("Số nhà %s, địa chỉ %s \n", soNha, diaChi);
        for(int i = 0; i < n; i++){
            System.out.printf("Thành viên %d:", i);
            System.out.println(danhSachThanhVien.get(i).toString());
        }
        System.out.println();
    }

    @Override
    public ThanhVien timThanhVien(String cccd) {
        ThanhVien thanhVien = null;
        for (ThanhVien tv: danhSachThanhVien) {
            if(tv.getCccd().equals(cccd)){
                thanhVien = tv;
                break;
            }
        }
        return thanhVien;
    }
}
