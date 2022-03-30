package bt;

public class Main {
    public static void main(String[] args) {
        MovableCircle movableCircle = new MovableCircle(3,4,5,6,1);
        System.out.println(movableCircle);
        movableCircle.moveUp();
    }
}
