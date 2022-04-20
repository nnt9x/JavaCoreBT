package com.nnt.functional;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Tạo functional - ko sử dụng biểu thức lambda
        HandlingString handlingString = new HandlingString() {
            @Override
            public int value(String s) {
                // Duyệt chuỗi = "mảng các kí tự" 
                // Duyệt từng kí tự ở trong chuỗi -> thêm set
                Set<Character> myChar = new HashSet<>();
                for (int i = 0; i < s.length(); i++) {
                    // loại bỏ dấu cách
                    if (s.charAt(i) == ' ') continue;
                    myChar.add(s.charAt(i));
                }
                return myChar.size();
            }
        };
        String test = "Hello world"; // H, e, l, o, w, r, d
        System.out.println(handlingString.value(test));

        // Thường function interface sử dụng các biểu thức lambda để rút gọn
        HandlingString handlingStringLambda = (s) -> {
            Set<Character> myChar = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                // loại bỏ dấu cách
                if (s.charAt(i) == ' ') continue;
                myChar.add(s.charAt(i));
            }
            return myChar.size();
        };
        String test1 = "Hello world BKACAD"; // H, e, l, o, w, r, d
        System.out.println(handlingStringLambda.value(test1));

    }
}
