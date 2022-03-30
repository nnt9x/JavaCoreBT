package main;

public interface IUser {
    // Đăng nhập
    public boolean login(String user, String pass);
    // Đăng xuất
    public void logout();
    // Xem thông tin cá nhân
    public void showInfo();
}
