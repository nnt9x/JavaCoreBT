package com.nnt.core.b2;

public class PhanSo {
    // Tử số: mặc định 0
    private long tuSo = 0;
    // Mẫu số mặc định là 1
    private long mauSo = 1;

    public PhanSo() {
        super();
    }

    public PhanSo(long tuSo, long mauSo) {
        if (mauSo == 0) throw new RuntimeException("Mẫu số phải khác 0!");
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public long getTuSo() {
        return tuSo;
    }

    public void setTuSo(long tuSo) {
        this.tuSo = tuSo;
    }

    public long getMauSo() {
        return mauSo;
    }

    public void setMauSo(long mauSo) {
        if (mauSo == 0) throw new RuntimeException("Mẫu số phải khác 0");
        this.mauSo = mauSo;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", this.tuSo, this.mauSo);
    }

    // Rút gọn phân số
    public void rutGon() {
        long gcd = GCD(tuSo, mauSo);
        tuSo = tuSo / gcd;
        mauSo = mauSo / gcd;
    }

    public PhanSo cong(PhanSo f) {
        long tmpTuSo = tuSo * f.mauSo + mauSo * f.tuSo;
        long tmpMauSo = mauSo * f.mauSo;
        PhanSo tmp = new PhanSo(tmpTuSo, tmpMauSo);
        tmp.rutGon();
        return tmp;
    }

    public PhanSo tru(PhanSo f) {
        long tmpMauSo = mauSo * f.mauSo;
        long tmpTuSo = tuSo * f.mauSo - mauSo * f.tuSo;
        PhanSo tmp = new PhanSo(tmpTuSo, tmpMauSo);
        tmp.rutGon();
        return tmp;
    }

    public PhanSo nhan(PhanSo f) {
        long tmpTuSo = tuSo * f.tuSo;
        long tmpMauSo = mauSo * f.mauSo;
        PhanSo tmp = new PhanSo(tmpTuSo, tmpMauSo);
        tmp.rutGon();
        return tmp;
    }

    public PhanSo chia(PhanSo f) {
        if (f.tuSo == 0) throw new RuntimeException("Không thể thực hiện phép chia");
        long tmpTuSo = tuSo * f.mauSo;
        long tmpMauSo = mauSo * f.tuSo;
        PhanSo tmp = new PhanSo(tmpTuSo, tmpMauSo);
        tmp.rutGon();
        return tmp;
    }

    // Tìm ước chung
    private static long GCD(long a, long b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 && b == 0) return 0;
        if (a == 0) return b;
        if (b == 0) return a;
        while (a != b) {
            if (a > b) a -= b;
            else b -= a;
        }
        return a;
    }
}
