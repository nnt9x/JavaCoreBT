package bai1;

import java.util.Locale;

public class VanBan implements IVanBan {
    protected String noiDung;

    public VanBan() {
        super();
    }

    public VanBan(String noiDung) {
        this.noiDung = noiDung.trim();
    }

    @Override
    public String toString() {
        return noiDung;
    }

    @Override
    public int demSoTu() {
        int count = 0;
//        String tmp = chuanHoaVanBan();
        for (int i = 0; i < noiDung.length() - 1; i++) {
            if (noiDung.charAt(i) == ' ' && noiDung.charAt(i + 1) != ' ') {
                count++;
            }
        }
        if (count != 0 && noiDung.charAt(0) != ' '){
            count ++;
        }
        return count;
    }

    @Override
    public String chuanHoaVanBan() {
        return this.noiDung.trim().replaceAll("[ ]+", " ");
    }

    @Override
    public String vietHoaToanBo() {
        return this.noiDung.toUpperCase(Locale.ROOT);
    }

    @Override
    public String vietThuongToanBo() {
        return this.noiDung.toLowerCase(Locale.ROOT);
    }

    @Override
    public String vietHoaTuDauTien() {
        StringBuilder stringBuilder = new StringBuilder(noiDung);
        if (stringBuilder.charAt(0) != ' ') {
            stringBuilder.setCharAt(0, Character.toUpperCase(noiDung.charAt(0)));
        }
        for (int i = 1; i < stringBuilder.length() - 1; i++) {
            if (stringBuilder.charAt(i) == ' ' && stringBuilder.charAt(i + 1) != ' ') {
                stringBuilder.setCharAt(i + 1, Character.toUpperCase(noiDung.charAt(i + 1)));
            }
        }
        return stringBuilder.toString();
    }

}
