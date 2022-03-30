package bai2;

public class HinhChuNhat extends HinhBinhHanh {

    public HinhChuNhat(double chieuDai, double chieuRong) {
        super(chieuDai, chieuRong, 90);
    }

    @SuppressWarnings("Không sử dụng")
    @Override
    public void setGoc(double goc) {
        System.out.println("Hình chữ nhật có góc 90 độ");
    }

    @Override
    public String toString() {
        return "HinhChuNhat[" + super.toString() + "]";
    }
}
