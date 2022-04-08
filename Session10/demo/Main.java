package demo;

public class Main {
    public static void main(String[] args) {
        // Box 1 lưu số
        Box<Double> box1 = new Box<>();
        box1.setT(1.5);

        Box<String> box2 = new Box<>();
        box2.setT("Hello");

        System.out.println(box1);
        System.out.println(box2);

        // Box3 chứa 1 đối tương HoaQua
        HoaQua tao = new HoaQua("Táo");
        Box<HoaQua> box3 = new Box<>();
        box3.setT(tao);

        System.out.println(box3.getT().ten);

        // Box4 có chứa được box 3 ko ???
        Box<Box> box4 = new Box<>();
        box4.setT(box3);
        System.out.println(box4.getT().getT());
        System.out.println(box4.getT().getT().getClass().getSimpleName());
        HoaQua q = (HoaQua) box4.getT().getT();
        System.out.println(q.ten);
    }
}
