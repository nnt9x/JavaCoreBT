package utils;

public final class Utils {
    // Khoá không cho tạo đối tượng
    private Utils() {
    }

    public static long GCD(long a, long b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 && b == 0) return 0;
        if (a == 0) return b;
        if (b == 0) return a;
        while (a != b) {
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        return a;
    }
}
