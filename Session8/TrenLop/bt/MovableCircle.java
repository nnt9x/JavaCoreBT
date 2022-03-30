package bt;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(
            int x, int y, int xSpeed, int ySpeed, int radius
    ) {
        this.radius = radius;
        center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return center.toString() + ",radius="+radius;
    }

    @Override
    public void moveUp() {
        System.out.printf(getClass()+" move up with xSpeed=%d, ySpeed=%d", center.xSpeed, center.ySpeed);
    }

    @Override
    public void moveDown() {
        System.out.printf(getClass()+" move down with xSpeed=%d, ySpeed=%d", center.xSpeed, center.ySpeed);
    }

    @Override
    public void moveLeft() {
        System.out.printf(getClass()+" move left with xSpeed=%d, ySpeed=%d", center.xSpeed, center.ySpeed);
    }

    @Override
    public void moveRight() {
        System.out.printf(getClass()+" move right with xSpeed=%d, ySpeed=%d", center.xSpeed, center.ySpeed);
    }
}
