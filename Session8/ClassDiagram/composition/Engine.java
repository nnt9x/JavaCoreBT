package composition;

public class Engine {

    private int volume = 1000;
    private CAR_ENGINE_TYPE type = CAR_ENGINE_TYPE.DIESEL;

    // Mặc định dung tích 1.0L và xe dầu
    public Engine() {
    }

    public Engine(int volume, CAR_ENGINE_TYPE type) {
        this.volume = volume;
        this.type = type;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public CAR_ENGINE_TYPE getType() {
        return type;
    }

    public void setType(CAR_ENGINE_TYPE type) {
        this.type = type;
    }
}
