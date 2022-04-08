package bai1;

public class Main {
    public static void main(String[] args) {
        VanBan vanBan = new VanBan();
        vanBan.noiDung = " test thu Du lieu   khong   chuan dinh dang !  ";
        System.out.println(vanBan.demSoTu());
        vanBan.noiDung = vanBan.vietHoaTuDauTien();
        vanBan.noiDung = vanBan.chuanHoaVanBan();
        System.out.println(vanBan);
    }
}
