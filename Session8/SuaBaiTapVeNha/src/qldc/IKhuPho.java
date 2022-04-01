package qldc;

public interface IKhuPho {
    public void themHoDan(HoDan hoDan);
    public void xoaHoDan(String soNha);
    public void xoaHoDan(HoDan hoDan);

    // Bổ sung
    public void thongTinKhuPho();
    public HoDan timHoDanTheoSoNha(String soNha);
}
