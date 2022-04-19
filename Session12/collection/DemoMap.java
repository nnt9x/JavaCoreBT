package com.nnt.collection;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {
    public static void main(String[] args) {
        // Map lưu trữ dữ liệu ở dạng Key-value
        // Mỗi key sẽ có 1value duy nhất
        Map<String, String> pc_and_ip = new HashMap<>();
        // Thêm 1 giá trị vào hashmap
        pc_and_ip.put("PC1","192.168.1.010");
        pc_and_ip.put("PC2","192.168.1.011");
        // In ra hashmap
        System.out.println(pc_and_ip);
        // Thử thêm 1 key bị trùng sẽ ntn?
        pc_and_ip.put("PC3","192.168.1.012");
        System.out.println(pc_and_ip);
        // Lấy 1 giá trị? nếu có trả về value , ko có thì trả về null
        System.out.println(pc_and_ip.get("PC4"));
        System.out.println(pc_and_ip.getOrDefault("PC4","192.168.1.255"));
    }
}
