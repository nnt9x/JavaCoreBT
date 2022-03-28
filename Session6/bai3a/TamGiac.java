package bai3a;

public class TamGiac extends DaGiac{

    public TamGiac(long[] arrCanh) {
        super(arrCanh);
        // Kiểm tra thêm có phải mảng kích thước bằng 3 hay ko ?
        if(arrCanh.length != 3){
            throw new IllegalArgumentException("Không phải 3 cạnh");
        }
        else{
            // Kiểm tra có phải tam giác hay ko ?
            double a = arrCanh[0];
            double b = arrCanh[1];
            double c = arrCanh[2];
            if(a + b <= c || a + c <= b || b + c <= a){
                throw new IllegalArgumentException("Không phải tam giác");
            }
        }
    }

    @Override
    public long tinhChuVi() {
        return super.tinhChuVi();
    }

    @Override
    public double tinhDienTich() {
        // Tính theo heron
        double p = tinhChuVi()/2;
        double a = arrCanh[0];
        double b = arrCanh[1];
        double c = arrCanh[2];
        double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return S;
    }
}
