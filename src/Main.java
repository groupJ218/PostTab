import dao.DaoPointOfSale;
import dao.DaoProduct;
import models.PointOfSale;
import models.Product;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        //        Product product = new Product();
//
//        product.setName("Apple");
//        product.setPrice(900.00);
//        product.setAmount(5.0);
//        product.setDescription("XS");
//        product.setPointId(2);

//        DaoProduct.addProduct(product);

//        System.out.println(DaoProduct.getProdByPointId(2).toString());

        System.out.println(DaoPointOfSale.getPointByPointId(1).toString());
    }
}
