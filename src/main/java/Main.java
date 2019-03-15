import models.Cart;
import models.Product;
import org.hibernate.Session;
import utils.HibernateConnector;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        long id = 1;
        Product product = getById(1, new Product());
        Cart cart = (Cart) getById(id,new Cart());
        product.setCart(cart);
        System.out.println(cart.toString());
        update(cart);
        System.out.println(getById(id, cart));
    }


    private static void createProduct(Product product) {
        Session session = HibernateConnector.getSession();
        session.beginTransaction();
        session.save(product);
        session.getTransaction().commit();
        session.close();
    }

    private static void update(Object o) {
        Session session = HibernateConnector.getSession();
        session.beginTransaction();
        session.update(o);
        session.getTransaction().commit();
        session.close();
    }

    private static void deleteById(long id, Object o) {
        Session session = HibernateConnector.getSession();
        session.beginTransaction();
        session.delete(getById(id, o.getClass()));
        session.getTransaction().commit();
        session.close();
    }

    private static <T> T getById (long id, T t) {
        T oTmp = null;
        Class<?> cls = t.getClass();
                Session session = HibernateConnector.getSession();
        System.out.println(t);
        oTmp  = (T) session.get(cls , id);
        session.close();
        return oTmp;
    }

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
