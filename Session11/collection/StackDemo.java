package com.nnt.collection;

import java.util.Stack;

public class StackDemo {

    public static void pushToMyStack(String s, Stack<String> stack){
        if(stack.size() == 5){
            stack.remove(0);
            stack.push(s);
        }
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        // Thêm vào trên cùng của stack
        stack.push("First");
        stack.push("Second");
        stack.push("Three");
        stack.push("Four");
        stack.push("Five");
        System.out.println(stack);
        // Để lưu 5 phép tính-> thêm trên cùng danh sách -> loại bỏ giá trị đầu tiên
        pushToMyStack("Six", stack);
        System.out.println(stack);
        pushToMyStack("Seven",stack);
        System.out.println(stack);
    }
}
