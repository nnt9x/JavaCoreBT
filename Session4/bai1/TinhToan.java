package bai1;

public class TinhToan {

    // Khoá không cho tạo đối tượng
    private TinhToan() {

    }

    public static PhanSo tong(PhanSo ps1, PhanSo ps2) {
        /*
        a/b + c/d = (ad + bc)/b*d
         */
        PhanSo ps = new PhanSo();
        long a = ps1.getTuSo();
        long b = ps1.getMauSo();

        long c = ps2.getTuSo();
        long d = ps2.getMauSo();

        ps.setTuSo(a * d + b * c);
        ps.setMauSo(b * d);
        return ps;
    }

    public static PhanSo hieu(PhanSo ps1, PhanSo ps2) {
        /*
        a/b - c/d = (ad - bc)/b*d
         */
        PhanSo ps = new PhanSo();
        long a = ps1.getTuSo();
        long b = ps1.getMauSo();

        long c = ps2.getTuSo();
        long d = ps2.getMauSo();

        ps.setTuSo(a * d - b * c);
        ps.setMauSo(b * d);
        return ps;
    }

    public static  PhanSo tich(PhanSo ps1, PhanSo ps2) {
        /*
        a/b : c/d = (a*c)/b*d
         */
        PhanSo ps = new PhanSo();
        long a = ps1.getTuSo();
        long b = ps1.getMauSo();

        long c = ps2.getTuSo();
        long d = ps2.getMauSo();

        ps.setTuSo(a * c);
        ps.setMauSo(b * d);
        return ps;
    }

    public static PhanSo thuong(PhanSo ps1, PhanSo ps2) {
        // Lưu ý trường hợp ps2 có tử số = 0 (ko tính được)

        /*
        a/b : c/d = a/b * d/c = (a*d) / (b*c)
         */
        if(ps2.getTuSo() == 0){
            throw new IllegalArgumentException("Không thể thực hiện phép tính");
        }
        PhanSo ps = new PhanSo();
        long a = ps1.getTuSo();
        long b = ps1.getMauSo();

        long c = ps2.getTuSo();
        long d = ps2.getMauSo();

        ps.setTuSo(a * d);
        ps.setMauSo(b * c);
        return ps;
    }
}
