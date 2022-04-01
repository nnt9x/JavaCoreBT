package dependency;

public class Customer {
    private String name;
    private String address;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Thanh toán tiền
    public void pay(Payment payment, double amount){
        System.out.printf("%s pay with %s amount = $%.2f",name,payment.getType(),amount);
    }
}
