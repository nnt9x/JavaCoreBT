package com.nnt.core.b2;

public class TinhToanSoThuc implements ITinhToan<Double> {
    @Override
    public Double cong(Double... args) {
        if (args.length == 0) throw new IllegalArgumentException("Hãy nhập dữ liệu!");
        double tmp = 0;
        for (double d : args) {
            tmp += d;
        }
        return tmp;
    }

    @Override
    public Double tru(Double... args) {
        if (args.length == 0) throw new IllegalArgumentException("Hãy nhập dữ liệu!");
        double tmp = args[0];
        for (int i = 1; i < args.length; i++) {
            tmp -= args[i];
        }
        return tmp;
    }

    @Override
    public Double nhan(Double... args) {
        if (args.length == 0) throw new IllegalArgumentException("Hãy nhập dữ liệu!");
        double tmp = args[0];
        for (int i = 1; i < args.length; i++) {
            tmp *= args[i];
        }
        return tmp;
    }

    @Override
    public Double chia(Double... args) {
        if (args.length == 0) throw new IllegalArgumentException("Hãy nhập dữ liệu!");
        double tmp = args[0];
        for (int i = 1; i < args.length; i++) {
            if (args[i] == 0) throw new IllegalArgumentException("Không thể chia cho 0");
            tmp /= args[i];
        }
        return tmp;
    }
}
