package bai2;

public class SoPhuc {
    private double phanThuc = 0;
    private double phanAo = 0;

    public SoPhuc() {
    }

    public SoPhuc(double phanThuc, double phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }

    public double getPhanThuc() {
        return phanThuc;
    }

    public void setPhanThuc(double phanThuc) {
        this.phanThuc = phanThuc;
    }

    public double getPhanAo() {
        return phanAo;
    }

    public void setPhanAo(double phanAo) {
        this.phanAo = phanAo;
    }

    @Override
    public String toString() {
        if (phanAo < 0) {
            return String.format("%.2f%.2fj", phanThuc, phanAo);
        }
        return String.format("%.2f+%.2fj", phanThuc, phanAo);
    }

    public SoPhuc cong(SoPhuc p) {
        double tmpPhanThuc = phanThuc + p.phanThuc;
        double tmpPhanAo = phanAo + p.phanAo;
        return new SoPhuc(tmpPhanThuc, tmpPhanAo);
    }

    public SoPhuc tru(SoPhuc p) {
        double tmpPhanThuc = phanThuc + p.phanThuc;
        double tmpPhanAo = phanAo + p.phanAo;
        tmpPhanThuc = phanThuc - p.phanThuc;
        tmpPhanAo = phanAo - p.phanAo;
        return new SoPhuc(tmpPhanThuc, tmpPhanAo);
    }

    public SoPhuc nhan(SoPhuc p) {
        double pThuc = phanThuc;
        double pAo = phanAo;
        double tmpPhanThuc = pThuc * p.phanAo - pAo * p.phanAo;
        double tmpPhanAo = pThuc * p.phanAo + pAo * p.phanThuc;
        return new SoPhuc(tmpPhanThuc, tmpPhanAo);
    }

    public SoPhuc chia(SoPhuc p) {
        if (p.phanThuc == 0 && p.phanAo == 0) {
            throw new RuntimeException("Không thể thực hiện phép tính!");
        }
        double pThuc = phanThuc;
        double pAo = phanAo;
        double tmpPhanThuc = (pThuc * p.phanThuc + pAo * p.phanAo) / (p.phanThuc * p.phanThuc + p.phanAo * p.phanAo);
        double tmpPhanAo = (pAo * p.phanThuc - pThuc * p.phanAo) / (p.phanThuc * p.phanThuc + p.phanAo * p.phanAo);
        return new SoPhuc(tmpPhanThuc, tmpPhanAo);
    }
}
