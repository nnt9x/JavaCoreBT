package bai3a;

import java.util.Arrays;

public abstract class DaGiac {
    protected long[] arrCanh;

    public DaGiac(long[] arrCanh){
        this.arrCanh = arrCanh;
    }

    public long tinhChuVi(){
        // Tổng tất cả các cạnh đa giác
        long t = 0;
        for (long canh: arrCanh) {
            t += canh;
        }
        return t;
    }

    public void inCanh(){
        System.out.println("Cạnh: "+ Arrays.toString(arrCanh));
    }

    public abstract double tinhDienTich();

}
