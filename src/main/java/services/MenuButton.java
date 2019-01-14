package services;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.control.TableView;
import models.PointOfSale;
import models.Product;

public class MenuButton {

    public static Scene productsInfo(PointOfSale point) {
        TableView table = new TableView();
        Scene scene = new Scene(new Group());
        Label label = new Label("Products in point ID: " + point.getId() + " name: " + point.getName());
        label.setFont(new Font("Arial", 20));
        table.setEditable(true);

        TableColumn nameColumn = new TableColumn<Product, String>("Name");
        TableColumn priceColumn = new TableColumn<Product, Double>("Price");
        TableColumn amountColumn = new TableColumn<Product, Double>("Amount");
        TableColumn descriptionColumn = new TableColumn<Product, String>("Description");

        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));

        ObservableList<Product> products = FXCollections.observableArrayList(point.getProducts());
        table.setItems(products);

        table.getColumns().addAll(nameColumn, priceColumn, amountColumn, descriptionColumn);
        VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table);

        ((Group) scene.getRoot()).getChildren().addAll(vbox);
        return scene;
    }
}
