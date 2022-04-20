package com.nnt.functional;

import java.util.Locale;
import java.util.function.Function;

public class Main3 {

    public static void printHandleString(String source, Function<String, String> fn) {
        System.out.println(fn.apply(source));
    }

    public static void main(String[] args) {
        // Viết thông thường
        printHandleString("ABC", new Function<String, String>() {
            @Override
            public String apply(String s) {
                return null;
            }
        });
        // VD: In ra chuỗi viết hoa
        printHandleString("Hello world", (s) -> {
            return s.toUpperCase(Locale.ROOT);
        });

        // In viết thường
        printHandleString("Hello world", (s) -> {
            return s.toLowerCase(Locale.ROOT);
        });

        // Chuyển thành tiếng việt (fake)
        printHandleString("Hello", (s)->{
            return "Xin chào";
        });

    }
}
