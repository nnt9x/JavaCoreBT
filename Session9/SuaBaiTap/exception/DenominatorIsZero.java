package exception;

public class DenominatorIsZero extends RuntimeException {
    // Exception: xử lý ngoại lệ
    public DenominatorIsZero(String message) {
        super(message);
    }
}
