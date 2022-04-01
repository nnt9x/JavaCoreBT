package dependency;

public class Payment {
    private PAYMENT_TYPE type = PAYMENT_TYPE.CASH;

    public Payment() {
    }

    public Payment(PAYMENT_TYPE type) {
        this.type = type;
    }

    public PAYMENT_TYPE getType() {
        return type;
    }

    public void setType(PAYMENT_TYPE type) {
        this.type = type;
    }

}
