package bai1;

public class PhanSo {
    // Đặt tên biến hoặc phương thức theo camel
    private long tuSo;
    // Mặc định đặt mẫu số khác 0
    private long mauSo = 1;

    public PhanSo() {
    }

    public PhanSo(long tuSo, long mauSo) {
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
        this.mauSo = mauSo;
    }

    @Override
    public String toString() {
        return "PhanSo[" +
                "tuSo=" + tuSo +
                ", mauSo=" + mauSo +
                ']';
    }
}
