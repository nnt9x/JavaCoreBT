import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static boolean validatePattern(String pattern, String data) {
        Pattern myPattern = Pattern.compile(pattern);
        return myPattern.matcher(data).matches();
    }

    public static void validateTel(String[] patterns, String[] tels) {
        boolean tmp = false;
        for (String s : tels) {
            tmp = false;
            for (String strPattern : patterns) {
                tmp = validatePattern(strPattern, s);
                if (tmp) break;
            }
            if (tmp) System.out.println(s + " là số Viettel");
            else System.out.println(s + " không là số Viettel");
        }
    }

    public static void validateTel(String[] patterns, String tels) {
        boolean tmp = false;
        for (String strPattern : patterns) {
            tmp = validatePattern(strPattern, tels);
            if (tmp) break;
        }
        if (tmp) System.out.println(tels + " là số Viettel");
        else System.out.println(tels + " không là số Viettel");

    }


    public static void main(String[] args) {
        String[] dataValid = {"0861238888", "0964444555", "0321123456",
                "0398272388", "(+84)973456766", "+84-973456767",
                "038.1234.999", "+84-361-223-454", "+84 971 234 888"
        };

        String[] dataInvalid = {"861238888", "840321123456",
                "(+84)0321123456", "0839738123"
        };

        validateTel(MyRegex.PATTERN_TEL, dataValid);
        validateTel(MyRegex.PATTERN_TEL, dataInvalid);

        Scanner in = new Scanner(System.in);
        System.out.print("Nhập số điện thoại từ bàn phím: ");
        String tel = in.nextLine().trim();
        in.close();
        validateTel(MyRegex.PATTERN_TEL, tel);
    }
}
