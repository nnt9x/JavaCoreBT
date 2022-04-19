package com.nnt.lambda;

public class Main {

    @FunctionalInterface
    interface Calculator {
        // Phép toán với 2 số thực a, b -> đều trả về 1 số thực
        double operator(double a, double b);
    }

    public static void main(String[] args) {
        // Lambda - >
        Calculator sum = (x, y) -> {
            return x + y;
        };

        System.out.println(sum.operator(5, 6));

        // Tính biểu thức 2x + 5y + 10
        Calculator express = (x, y) -> {
            return 2 * x + 5 * y + 10;
        };
        System.out.println(express.operator(1,2));

    }
}
