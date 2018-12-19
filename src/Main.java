import dao.DaoProduct;
import models.Product;

public class Main {
    public static void main(String[] args) {

        Product product = new Product();

        product.setName("Apple");
        product.setPrice(1200.00);
        product.setAmount(1.0);
        product.setDescription("XS");
        product.setPointId(1);

        DaoProduct.addProduct(product);
    }
}
