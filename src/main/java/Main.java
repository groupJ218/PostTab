import dao.DaoModels;
import models.Cart;
import models.Product;
import models.Right;
import models.Role;
import org.hibernate.Session;
import utils.HibernateConnector;

import java.util.ArrayList;
import java.util.List;

import static dao.DaoModels.getById;

public class Main {
    public static void main(String[] args) {
        Role role = new Role();
        role.setDefault(true);
        role.setRoleName("User");
        DaoModels.create(role);

//        Right right = new Right();
//        right.setRightName("admin");
//        DaoModels.create(right);


//        DaoModels.create(role);

//        long id = 1;
////        get product from DB
//        Product product = getById(1, new Product());
//        System.out.println(product);
//        System.out.println("======================");
////        get Cart from DB
//        Cart cart = getById(id, new Cart());
//        product.setCart(cart);
//        DaoModels.update(product);
//
//        System.out.println("======================");
//        System.out.println(getById(id, cart));
    }

//    private static void createProduct(Product product) {
//        Session session = HibernateConnector.getSession();
//        session.beginTransaction();
//        session.save(product);
//        session.getTransaction().commit();
//        session.close();
//    }


    private static void createListCarts() {
        int count = 0;
        while (count != 7) {
            Cart cart = new Cart(7);
            Session session = HibernateConnector.getSession();
            session.beginTransaction();
            session.save(cart);
            session.getTransaction().commit();
            session.close();
            count++;
            HibernateConnector.sessionFactoryShutdown();
        }
    }
}


//        System.out.println(DaoProduct.getAll());
//        System.out.println(DaoProduct.getProdById(4));
//        System.out.println(DaoProduct.getProdByPointId(1));

//        DaoRights.addRight(new Right("ADMIN"));
//        System.out.println(DaoRights.getAll().toString());

        /* JavaFx example....
         First need extend Application from javafx.s..
         in main method add *-- lunch method(args); --*
         Then override public void start(); from javafx Application
        */
//        launch(args);

/*        Product product = new Product();
        product.setName("Apple");
        product.setPrice(900.00);
        product.setAmount(5.0);
        product.setDescription("XS");
        product.setPointId(2);
        DaoProduct.addProduct(product);
        System.out.println(DaoProduct.getProdByPointId(2).toString());
        System.out.println(DaoPointOfSale.getPointByPointId(1).toString());
*/
//    }

//    @Override
//    public void start(Stage primaryStage){
//
//        Screen screen = Screen.getPrimary();
//        Rectangle2D bounds = screen.getVisualBounds();
//        primaryStage.setX(bounds.getMinX());
//        primaryStage.setY(bounds.getMinY());
//        primaryStage.setWidth(bounds.getWidth());
//        primaryStage.setHeight(bounds.getHeight());
//        primaryStage.setMaximized(true);
//        primaryStage.setFullScreen(true);
//        PointOfSale point = DaoPointOfSale.getPointByPointId(1);
//        BorderPane root = new BorderPane();
//        Scene scene = new Scene(root);
//        boolean add = scene.getStylesheets().add("application.css");
//        System.out.println("Is added file application.css  " + add);
//        primaryStage.setTitle(point.getName());
//        primaryStage.setScene(MenuButton.productsInfo(point));
//        primaryStage.show();
//    }
//}
