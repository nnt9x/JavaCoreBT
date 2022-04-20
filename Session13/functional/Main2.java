package com.nnt.functional;

import java.util.Locale;
import java.util.function.Function;

public class Main2 {
    public static void main(String[] args) {
        // Functional Interface Builtin: có sẵn -> chỉ lấy ra sử dụng -> ko cần định nghĩa

        // ĐỊnh nghĩa nhanh 1 hàm: có giá trị truyền vào là 1 chuỗi -> giá trị trả về là 1 chuỗi
        // sau khi được viết hoa toàn bộ.
        Function<String, String> convertString = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase(Locale.ROOT);
            }
        };
        // Viết theo lambda
        Function<String, String> convertStringLambda = (s) -> {
            return s.toUpperCase(Locale.ROOT);
        };

        // Sử dụng:
        System.out.println(convertString.apply("Hello"));

        // Hãy viết 1 hàm convertString -> chuỗi viết hoa chữ cái đầu tiên. -> viết thường.
        // VD: abcDeF ghHDD => Abcdef ghhdd

        Function<String, String> convertStringCLower = new Function<String, String>() {
            @Override
            public String apply(String s) {
                // Viết thường toàn bộ
                s = s.toLowerCase();
                // Cần cập nhật lại viết hoa cho kí tự đầu tiên
                char[] tmp = s.toCharArray();
                tmp[0] = Character.toUpperCase(tmp[0]);
                return new String(tmp);
            }
        };
        //
        System.out.println(convertStringCLower.apply("abcDeF ghHDD"));

        // Có rất nhiêu cách nhau để biến đổi chuỗi String -> String
    }
}
