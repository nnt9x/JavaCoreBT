package bai2;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1);
        System.out.println(c1.getCircumference());

        Circle c2 = new Circle(3);
        System.out.println(c2);
        System.out.println(c2.getArea());
    }
}
