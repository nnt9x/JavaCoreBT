package tuuTuong2;

import java.util.List;

public class Admin extends Account implements ILogin, IProduct {

    @Override
    public boolean login(String user, String password) {
        return false;
    }

    @Override
    public void logout() {

    }

    @Override
    public long insertProduct(Product product) {
        return 0;
    }

    @Override
    public boolean updateProduct(Product product) {
        return false;
    }

    @Override
    public boolean deleteProduct(long id) {
        return false;
    }

    @Override
    public Product getProduct(long id) {
        return null;
    }

//    @Override
//    public List<Product> getListProducts() {
//        return null;
//    }
}
