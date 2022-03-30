package main;

public class Admin implements IAdmin{
    @Override
    public long createProduct() {
        return 0;
    }

    @Override
    public long deleteUser(long idUser) {
        return 0;
    }

    @Override
    public void newAction() {

    }

    @Override
    public boolean login(String user, String pass) {
        return false;
    }

    @Override
    public void logout() {

    }

    @Override
    public void showInfo() {

    }
}
