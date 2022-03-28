package tuuTuong2;

import java.util.List;

public interface IProduct {
    public long insertProduct(Product product);
    public boolean updateProduct(Product product);
    public boolean deleteProduct(long id);
    public Product getProduct(long id);
//    public List<Product> getListProducts();
}
