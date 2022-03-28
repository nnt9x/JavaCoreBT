package tuuTuong2;

public class Account {
    private String name;
    private String password;
    private String info;

    public Account(String name, String password, String info) {
        this.name = name;
        this.password = password;
        this.info = info;
    }

    public Account() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
