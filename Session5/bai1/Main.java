package bai1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0, "yellow");
        System.out.printf("Diện tích: %.2f cm2\n", circle.getArea());
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(3.0, "blue", 2.0);
        System.out.printf("Thể tích: %.2f cm3\n", cylinder.getVolume());
    }
}
