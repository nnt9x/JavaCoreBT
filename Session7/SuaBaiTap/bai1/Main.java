package bai1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println(circle);
        System.out.printf("Chu vi %.2f cm, dien tich %.2f cm2 \n", circle.getPerimeter(), circle.getArea());

        ResizableCircle rCircle = new ResizableCircle(5.0);
        // Giảm còn 20% kích thước ban đầu
        rCircle.resize(20);
        System.out.println(rCircle);

        System.out.printf("Chu vi %.2f cm, dien tich %.2f cm2 \n", rCircle.getPerimeter(), rCircle.getArea());

    }
}
