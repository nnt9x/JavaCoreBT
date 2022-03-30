package bai2;

public class HinhTru implements HinhHoc3D {
    private double chieuCao;
    private HinhTron day;

    public HinhTru(double chieuCao, HinhTron day) {
        this.chieuCao = chieuCao;
        this.day = day;
    }

    public HinhTru(double chieuCao, double banKinhDay) {
        this.chieuCao = chieuCao;
        this.day = new HinhTron(banKinhDay);
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public HinhTron getDay() {
        return day;
    }

    public void setDay(HinhTron day) {
        this.day = day;
    }

    public void setDay(double banKinhDay) {
        this.day = new HinhTron(banKinhDay);
    }

    @Override
    public double tinhTheTich() {
        return day.tinhDienTich() * chieuCao;
    }

    @Override
    public String toString() {
        return "HinhTru[" +
                "chieuCao=" + chieuCao +
                ", day=" + day.toString() +
                ']';
    }
}
