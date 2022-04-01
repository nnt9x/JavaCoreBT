package complex;

/*
Xe máy có 1 động cơ: dung tích, công suất và loại động cơ.
(Động cơ được gắn liền với xe máy, ko tạo riêng trong lúc sử dụng - composite)

Xe máy 2-3 bánh (kích thước), có thể thay thế bất kì lúc nào !
 */

import java.util.ArrayList;
import java.util.List;

public class Moto {
    private String name;
    private final Engine engine;
    private List<Wheel> wheels;

    public Moto(String name, int volume, int power, MOTO_ENGINE_TYPE type, List<Wheel> wheels) {
        this.name = name;
        this.wheels = wheels;
        engine = new Engine(volume, power, type);
    }

    public Moto(String name, int volume, int power, MOTO_ENGINE_TYPE type){
        this.name = name;
        engine = new Engine(volume, power, type);
        // Mặc định thêm 2 bánh xe
        this.wheels = new ArrayList<>();
        this.wheels.add(new Wheel());
        this.wheels.add(new Wheel());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }
}
