package com.nnt.core.b2;

public class TinhToanPhanSo implements ITinhToan<PhanSo> {

    @Override
    public PhanSo cong(PhanSo... args) {
        if (args.length == 0) throw new RuntimeException("Không để trống");
        PhanSo tmp = args[0];
        for (int i = 1; i < args.length; i++) {
            tmp = tmp.cong(args[i]);
        }
        return tmp;
    }

    @Override
    public PhanSo tru(PhanSo... args) {
        if (args.length == 0) throw new RuntimeException("Không để trống");
        PhanSo tmp = args[0];
        for (int i = 1; i < args.length; i++) {
            tmp = tmp.tru(args[i]);
        }
        return tmp;
    }

    @Override
    public PhanSo nhan(PhanSo... args) {
        if (args.length == 0) throw new RuntimeException("Không để trống");
        PhanSo tmp = args[0];
        for (int i = 1; i < args.length; i++) {
            tmp = tmp.nhan(args[i]);
        }
        return tmp;
    }

    @Override
    public PhanSo chia(PhanSo... args) {
        if (args.length == 0) throw new RuntimeException("Không để trống");
        PhanSo tmp = args[0];
        for (int i = 1; i < args.length; i++) {
            tmp = tmp.chia(args[i]);
        }
        return tmp;
    }
}
