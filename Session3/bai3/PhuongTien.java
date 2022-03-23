package bai3;

public class PhuongTien {
    private String tenXe;
    private int dungTich;
    private double giaXe;

    public PhuongTien() {
    }

    public PhuongTien(String tenXe, int dungTich, double giaXe) {
        this.tenXe = tenXe;
        this.dungTich = dungTich;
        this.giaXe = giaXe;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public double getGiaXe() {
        return giaXe;
    }

    public void setGiaXe(double giaXe) {
        this.giaXe = giaXe;
    }

    public double thueTruocBa(){
        if(dungTich  < 100){
            return giaXe * 0.01;
        }
        else if( dungTich < 200){
            return giaXe * 0.03;
        }
        else {
            return giaXe * 0.05;
        }
    }

}
