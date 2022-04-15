package com.nnt.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListDemo {
    public static void main(String[] args) {
        // Làm việc với ArrayList

        // VD: tạo ra mảng lưu trữ String-> tạo mảng thông thường
        String[] arrString = new String[30];
        // Gán giá trị cho các phần tử
        arrString[0] = "Hello";
        arrString[1] = "Java";
        // Nhược điểm: kích thước cố định, có lúc thiếu có lúc thừa

        // Làm việc với mảng động: không cần kích thước ban đầu
        ArrayList<String> arrayList = new ArrayList<>();

        // Thêm phần tử: method add
        arrayList.add("Hello");
        arrayList.add("Java");
        arrayList.add("Collection");

        // In ra list
        System.out.println(arrayList);

        // Câp nhật giá trị 1 phần tử: set
        arrayList.set(0, "Hi");
        System.out.println(arrayList);

        // Xoá phần tử: remove
        arrayList.remove(1);
        System.out.println(arrayList);

        // Xoá object: biến -> tham chiếu object đấy
        String element = "Test";
        arrayList.add(element);

        System.out.println(arrayList);
        // Xoá theo đôi tượng
        arrayList.remove(element);
        System.out.println(arrayList);

        // Sắp xếp: theo Alphabet (nếu chuỗi), số thì sắp xếp từ bé đến lớn
        Collections.sort(arrayList);
        System.out.println(arrayList);

        // Đảo ngược arrayList
        Collections.reverse(arrayList);
        System.out.println(arrayList);

        // VD: Tạo 1 arrayList lưu trữ các số thực, thêm ngẫu nhiên 10 phần tử và sắp xếp theo thứ
        // tự từ bé đến lớn.

        ArrayList<Double> arrDouble = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrDouble.add(new Random().nextDouble());
        }
        System.out.println(arrDouble);
        Collections.sort(arrDouble);
        System.out.println(arrDouble);

    }
}
