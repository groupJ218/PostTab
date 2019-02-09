import dao.DaoPointOfSale;
import dao.DaoRights;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Screen;
import javafx.stage.Stage;
import models.PointOfSale;
import models.Right;
import services.MenuButton;

public class Main extends Application {
    public static void main(String[] args) {

        DaoRights.addRight(new Right("ADMIN"));
        System.out.println(DaoRights.getAll().toString());

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
    }

    @Override
    public void start(Stage primaryStage){

        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();
        primaryStage.setX(bounds.getMinX());
        primaryStage.setY(bounds.getMinY());
        primaryStage.setWidth(bounds.getWidth());
        primaryStage.setHeight(bounds.getHeight());
        primaryStage.setMaximized(true);
//        primaryStage.setFullScreen(true);
//        PointOfSale point = DaoPointOfSale.getPointByPointId(1);
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root);
//        boolean add = scene.getStylesheets().add("application.css");
//        System.out.println("Is added file application.css  " + add);
//        primaryStage.setTitle(point.getName());
//        primaryStage.setScene(MenuButton.productsInfo(point));
        primaryStage.show();
    }
}
