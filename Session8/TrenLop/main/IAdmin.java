package main;

public interface IAdmin extends IUser{
    public long createProduct();
    public long deleteUser(long idUser);
    //
    public void newAction();
}
