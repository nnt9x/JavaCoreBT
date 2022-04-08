package demo;

public class Box <T>{
    // Có 1 thuộc tính có kiểu dữ liệu là T
    private T t;
    public Box(){

    }
    public Box(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Box[" +
                "t=" + t +
                ']';
    }
}
