package app;

import fraction.Calculator;
import fraction.Fraction;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Khai báo phân số 1 và rút gọn phân số
        Fraction pt1 = new Fraction(3, 4);
        pt1.reduce();

        Fraction pt2 = new Fraction(10, 20);
        pt2.reduce();

        // Khai báo phân số 3 và rút gọn phân số
        Fraction pt3 = new Fraction(30, 40);
        pt3.reduce();

        Calculator calculator = Calculator.getInstance();
        Fraction tong = calculator.add(pt1, pt2, pt3);
        System.out.println("Tổng: " + tong);
        Fraction hieu = calculator.sub(pt1, pt3);
        System.out.println("Hiệu: " + hieu);
        Fraction tich = calculator.mul(pt1, pt3);
        System.out.println("Tích: " + tich);

    }
}
