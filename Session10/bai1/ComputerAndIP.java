package bai1;

import java.util.Arrays;

public class ComputerAndIP extends KeyValue<String,String[]>{
    public ComputerAndIP() {
    }

    public ComputerAndIP(String key, String[] value) {
        super(key, value);
    }

    @Override
    public String toString() {
        return String.format("Computer[%s, IP=%s]",
                super.getKey(), Arrays.toString(super.getValue()));
    }
}
