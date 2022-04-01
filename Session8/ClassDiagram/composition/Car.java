package composition;

/*
Bài toán: để tạo ra 1 đối tượng xe ô tô cần có động cơ xe - engine,
trong lúc khởi tạo đối tượng xe tạo 1 đối tượng engine ngay bên trong.

đối tượng engine không có vòng đời riêng mà phụ thuộc vào đối tượng xe.
- Khi đối tượng xe bị xoá -> engine cũng xoá theo

- 2 đối tượng phải cùng tồn tại!

 */
public class Car {
    private String name;
    private double price;
    private final Engine engine;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
        this.engine = new Engine();
    }

    public Car(String name, double price, int volume, CAR_ENGINE_TYPE type){
        this.name = name;
        this.price = price;
        this.engine = new Engine(volume, type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }
}
