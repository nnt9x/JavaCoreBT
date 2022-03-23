package bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ThuVien <T extends TaiLieu> {
    public static enum LoaiTaiLieu {
        SACH, BAO, TAPCHI
    }

    private List<T> listTaiLieu;

    public ThuVien(){
        this.listTaiLieu = new ArrayList<>();
    }

    public int nhapTaiLieu(T taiLieu){
        this.listTaiLieu.add(taiLieu);
        return this.listTaiLieu.size()-1;
    }

    public void hienThiTaiLieu(){
        for (T t: listTaiLieu) {
            System.out.println(t);
        }
    }

    public void hienThiThongTinTaiLieu(String maTaiLieu){
        boolean flag = false;
        for (T t: listTaiLieu) {
            if(t.getMaTaiLieu().equals(maTaiLieu)){
                System.out.println(t);
                flag = true;
                break;
            }
        }
        if(!flag) System.out.println("Không thấy tài liệu");
    }

    public void hienThiTaiLieuTheoLoai(LoaiTaiLieu loai){
        String className = loai.name().toLowerCase(Locale.ROOT);
        int count = 0;
        for (T taiLieu: listTaiLieu) {
            if(taiLieu.getClass().getSimpleName().toLowerCase(Locale.ROOT).equals(className)){
                System.out.println(taiLieu);
                count ++;
            }
        }
        if(count == 0){
            System.out.println("Không có tài liệu: "+loai.toString());
        }
    }

}
