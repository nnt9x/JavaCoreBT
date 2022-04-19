package com.nnt.lambda;

public class MyCalculator {
    // Chỉ cho phép tính toán cộng, trừ, nhân chia cơ bản, đồng thời cho phép người dùng tự định nghĩa
    // nhanh các phép tính
    @FunctionalInterface
    interface Operator {
        // đối với function interface chỉ có duy nhất 1 phương thức
        double values(double a, double b);
    }

    public double cong(double a, double b) {
        return a + b;
    }

    public double tru(double a, double b) {
        return a - b;
    }

    // Do somethings
    public double doSomeThing(Operator operator, double a, double b) {
        return operator.values(a, b);
    }

}
