package bt;

public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return String.format("(%d,%d), speed=(%d,%d)",x,y, xSpeed , ySpeed);
    }

    @Override
    public void moveUp() {
        System.out.printf("Move up with xSpeed=%d, ySpeed=%d", xSpeed, ySpeed);
    }

    @Override
    public void moveDown() {
        System.out.printf("Move down with xSpeed=%d, ySpeed=%d", xSpeed, ySpeed);
    }

    @Override
    public void moveLeft() {
        System.out.printf("Move left with xSpeed=%d, ySpeed=%d", xSpeed, ySpeed);
    }

    @Override
    public void moveRight() {
        System.out.printf("Move right with xSpeed=%d, ySpeed=%d", xSpeed, ySpeed);
    }
}
