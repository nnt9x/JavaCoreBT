package qldc;

public interface IHoDan {
    public void themThanhVien(ThanhVien thanhVien);
    public void xoaThanhVien(ThanhVien thanhVien);
    public void xoaThanhVien(String cccd);

    // Bổ sung
    public void thongTinHoDan();
    public ThanhVien timThanhVien(String cccd);
}
