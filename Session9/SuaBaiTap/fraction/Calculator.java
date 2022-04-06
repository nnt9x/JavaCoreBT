package fraction;

// Tạo đối tượng theo design pattern Singleton: 1 class chỉ tạo 1 đối tượng duy nhất
public class Calculator implements IFraction {
    private static Calculator calculator = null;

    private Calculator() {
        super();
    }

    public synchronized static Calculator getInstance() {
        if (calculator == null) calculator = new Calculator();
        return calculator;
    }

    @Override
    public Fraction add(Fraction... args) {
        if (args.length == 0) return null;
        Fraction tmp = new Fraction(args[0].getNumerator(), args[0].getDenominator());
        for (int i = 1; i < args.length; i++) {
            tmp.add(args[i]);
        }
        return tmp;
    }

    @Override
    public Fraction sub(Fraction... args) {
        if (args.length == 0) return null;
        Fraction tmp = new Fraction(args[0].getNumerator(), args[0].getDenominator());
        for (int i = 1; i < args.length; i++) {
            tmp.sub(args[i]);
        }
        return tmp;
    }

    @Override
    public Fraction mul(Fraction... args) {
        if (args.length == 0) return null;
        Fraction tmp = new Fraction(args[0].getNumerator(), args[0].getDenominator());
        for (int i = 1; i < args.length; i++) {
            tmp.mul(args[i]);
        }
        return tmp;
    }

    @Override
    public Fraction div(Fraction... args) {
        if (args.length == 0) return null;
        Fraction tmp = new Fraction(args[0].getNumerator(), args[0].getDenominator());
        for (int i = 1; i < args.length; i++) {
            tmp.div(args[i]);
        }
        return tmp;
    }
}
