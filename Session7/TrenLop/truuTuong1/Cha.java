package truuTuong;

public class Cha {
    private String hoTen;
    private int tuoi;

    public Cha() {
    }

    public Cha(String hoTen, int tuoi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void choiTheThao(){
        System.out.println("Choi bong ro");
    }
}
