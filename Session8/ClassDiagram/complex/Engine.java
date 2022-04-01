package complex;

public class Engine {
    private int volume;
    private int power;
    private MOTO_ENGINE_TYPE type;

    public Engine(int volume, int power, MOTO_ENGINE_TYPE type) {
        this.volume = volume;
        this.power = power;
        this.type = type;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public MOTO_ENGINE_TYPE getType() {
        return type;
    }

    public void setType(MOTO_ENGINE_TYPE type) {
        this.type = type;
    }
}
