package fraction;

import exception.DenominatorIsZero;
import utils.Utils;

public class Fraction {
    // Tử số: mặc định 0
    private long numerator = 0;
    // Mẫu số mặc định là 1
    private long denominator = 1;

    public Fraction() {
        super();
    }

    public Fraction(long numerator, long denominator) {
        if (denominator == 0) throw new RuntimeException("Mẫu số phải khác 0!");
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public long getNumerator() {
        return numerator;
    }

    public void setNumerator(long numerator) {
        this.numerator = numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public void setDenominator(long denominator) {
        if (denominator == 0) throw new DenominatorIsZero("Mẫu số phải khác 0");
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", this.numerator, this.denominator);
    }

    // Rút gọn phân số
    public void reduce() {
        long gcd = Utils.GCD(numerator, denominator);
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }

    public Fraction add(Fraction f) {
        numerator = numerator * f.denominator + denominator * f.numerator;
        denominator = denominator * f.denominator;
        reduce();
        return this;
    }

    public Fraction sub(Fraction f) {
        denominator = denominator * f.denominator;
        numerator = numerator * f.denominator - denominator * f.numerator;
        reduce();
        return this;
    }

    public Fraction mul(Fraction f) {
        numerator = numerator * f.numerator;
        denominator = denominator * f.denominator;
        reduce();
        return this;
    }

    public Fraction div(Fraction f) {
        if (f.numerator == 0) throw new DenominatorIsZero("Không thể thực hiện phép chia");
        numerator = numerator * f.denominator;
        denominator = denominator * f.numerator;
        reduce();
        return this;
    }
}
