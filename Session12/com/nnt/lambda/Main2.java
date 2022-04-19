package com.nnt.lambda;

public class Main2 {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        System.out.println(myCalculator.cong(4, 5));
        // Muốn tính phép tính (2a + 5b) + 3 ??

        double rs = myCalculator.doSomeThing((a, b) -> {
            return (2 * a + 5 * b) + 3;
        }, 4, 5);
        System.out.println(rs);

        // Tính giá trị 2^3
        double rs1 = myCalculator.doSomeThing((a, b) -> {
            return Math.pow(a, b);
        }, 2, 3);
        System.out.println(rs1);

        // Viết theo thông thường, ko theo lambda: (a+b)^2
        double rs2 = myCalculator.doSomeThing(new MyCalculator.Operator() {
            @Override
            public double values(double a, double b) {
                return (a + b) * (a + b);
            }
        }, 2, 3);
        System.out.println(rs2);

        // Tính biểu thức bất kì: "2a + 5b + 10" -> gồm có toán hạng, toán tử ->

    }
}
