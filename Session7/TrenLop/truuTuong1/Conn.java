package truuTuong;

public class Conn extends Cha implements HanhViMe,HanhViBac{

    public Conn() {
    }

    public Conn(String hoTen, int tuoi) {
        super(hoTen, tuoi);
    }

    @Override
    public String nauAn() {
        return "Nấu ăn ngon";
//        System.out.println("Nấu ăn ngon như mẹ");
    }

    @Override
    public void choiNhacCu() {
        System.out.println("Biết chơi piano");
    }

    @Override
    public void caHat() {
        System.out.println("Biết ca hát");
    }
}
