package bai1;

public class App {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0);
        System.out.println(circle);
        System.out.printf("Chu vi %.2f cm, dien tich %.2f cm2 \n", circle.getPerimeter(), circle.getArea());

        System.out.println("----------------------------");

        Rectangle rectangle = new Rectangle(3.0, 4.0);
        System.out.println(rectangle);
        System.out.printf("Chu vi %.2f cm, dien tich %.2f cm2 \n", rectangle.getPerimeter(), rectangle.getArea());

        System.out.println("----------------------------");


        Square square = new Square();
        square.setSide(5.0);
        System.out.println(square);
        System.out.printf("Chu vi %.2f cm, dien tich %.2f cm2 \n", square.getPerimeter(), square.getArea());
    }
}
