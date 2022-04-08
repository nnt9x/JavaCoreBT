package bai1;

import java.security.Key;

public class Main {
    public static void main(String[] args) {
        // Xây dựng từ điển tiếng anh
        KeyValue<String, String>[] tuDien = new KeyValue[100];
        tuDien[0] = new KeyValue("Hello", "Xin chào");
        tuDien[1] = new KeyValue("Bye", "tạm biệt");
        // duyện từ điển và in ra
        for (KeyValue item : tuDien) {
            if (item == null) break;
            System.out.println(item);
        }
        //
        KeyValue<String, String[] > t = new KeyValue<>();
        t.setKey("hello");
        t.setValue(new String[]{"chào", "xin chào"});
        System.out.println(t);

        ComputerAndIP c1 =  new ComputerAndIP();
        c1.setKey("PC1");
        c1.setValue(new String[]{"192.168.1.10", "192.168.1.11"});
        System.out.println(c1);
    }
}
