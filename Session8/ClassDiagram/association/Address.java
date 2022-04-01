package association;

public class Address {
    // Address Line
    private String addressLine;
    //City. The city portion of the address.
    private String city;
    // Zip. The postal code portion of this address.
    private int zip;
    // State. The state portion of the address.
    private String state;
    // Country. The country portion of the address.
    private String country;

    public Address() {
        super();
    }

    public Address(String addressLine, String city, int zip, String state, String country) {
        this.addressLine = addressLine;
        this.city = city;
        this.zip = zip;
        this.state = state;
        this.country = country;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
