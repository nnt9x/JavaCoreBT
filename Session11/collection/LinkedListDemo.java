package com.nnt.collection;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String > linkedList = new LinkedList<>();
        linkedList.add("Hello");
        linkedList.add("Java");
        linkedList.add("Collection");

        System.out.println(linkedList);
        // Thêm dữ liệu vào đầu linkedlist
        linkedList.addFirst("Fisrt");
        System.out.println(linkedList);

        // Ít dùng hơn: triển khai của danh sách liên kết đơn và danh sách liên kết đôi (cấu trúc
        // dữ liệu)

        // Khi nào dùng ArrayList vs Linked list -> tương tự nhau ????

    }
}
