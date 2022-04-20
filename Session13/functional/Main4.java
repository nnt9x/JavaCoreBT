package com.nnt.functional;

import java.util.function.Function;

public class Main4 {

    public static double calculatorNumbers(Function<int[], Double> fn, int[] numbers) {
        return fn.apply(numbers);
    }

    public static void main(String[] args) {
        // Input: dãy số nguyên, output luôn là số thực
        // Về cơ bản có quá nhiều phép tính có thể thực -> định nghĩa hàm chung
        // sử dụng -> định nghĩa chi

        int[] arrNumber = {1, 2, 3, 4};
        double tbc = calculatorNumbers(new Function<int[], Double>() {
            @Override
            public Double apply(int[] ints) {
                double t = 0;
                for (int i = 0; i < ints.length; i++) {
                    t += ints[i];
                }
                return t / ints.length;
            }
        }, arrNumber);

        System.out.println(tbc);

        // Trung bình nhân (lambda)
        double tbn = calculatorNumbers((ints) -> {
            double t = 1;
            for (int i = 0; i < ints.length; i++) {
                t *= ints[i];
            }
            return Math.pow(t, 1.0 / ints.length);
        }, arrNumber);

        System.out.println(tbn);
    }
}
