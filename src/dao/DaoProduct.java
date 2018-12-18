package dao;

import models.Product;
import utils.Connector;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoProduct {

    public static void addProduct(Product product) {
        String query = "INSERT INTO mydb.products (POINT_ID, PRICE, AMOUNT, NAME , DESCRIPTION) VALUES (?,?,?,?,?)";

        try {
            PreparedStatement ps = Connector.getConnection().prepareStatement(query);
            ps.setLong(1, product.getPointId());
            ps.setDouble(2, product.getPrice());
            ps.setDouble(3, product.getAmount());
            ps.setString(4, product.getName());
            ps.setString(5,product.getDescription());
            ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Connector.closeConnection();
        }
    }
}
