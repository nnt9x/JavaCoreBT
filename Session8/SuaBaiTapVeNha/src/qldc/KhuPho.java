package qldc;

import java.util.ArrayList;
import java.util.List;

public class KhuPho implements IKhuPho {
    private String tenKhuPho;
    private List<HoDan> danhSachHoDan;

    public KhuPho() {
        danhSachHoDan = new ArrayList<>();
    }

    public KhuPho(String tenKhuPho, List<HoDan> danhSachHoDan) {
        this.tenKhuPho = tenKhuPho;
        this.danhSachHoDan = danhSachHoDan;
    }

    public String getTenKhuPho() {
        return tenKhuPho;
    }

    public void setTenKhuPho(String tenKhuPho) {
        this.tenKhuPho = tenKhuPho;
    }

    public List<HoDan> getDanhSachHoDan() {
        return danhSachHoDan;
    }

    public void setDanhSachHoDan(List<HoDan> danhSachHoDan) {
        this.danhSachHoDan = danhSachHoDan;
    }

    @Override
    public void themHoDan(HoDan hoDan) {
        danhSachHoDan.add(hoDan);
    }

    @Override
    public void xoaHoDan(String soNha) {
        boolean flag = false;
        for (HoDan hoDan : danhSachHoDan) {
            if (hoDan.getSoNha().equals(soNha)) {
                flag = true;
                return;
            }
        }
        if (!flag) System.out.println("Không có số nhà " + soNha);
    }

    @Override
    public void xoaHoDan(HoDan hoDan) {
        danhSachHoDan.remove(hoDan);
    }

    @Override
    public void thongTinKhuPho() {
        System.out.printf("Khu phố %s có %d hộ dân\n", tenKhuPho, danhSachHoDan.size() );
        for (HoDan hodan: danhSachHoDan) {
            System.out.println("----------------------------------");
            hodan.thongTinHoDan();
        }
    }

    @Override
    public HoDan timHoDanTheoSoNha(String soNha) {
        // Mặc định null nếu không tìm thấy
        HoDan hoDan = null;
        for (HoDan hd: danhSachHoDan) {
            if(hd.getSoNha().equals(soNha)){
                hoDan = hd;
                break;
            }
        }
        return hoDan;
    }
}
