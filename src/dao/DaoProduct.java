package dao;

import models.Product;
import utils.Connector;

import java.sql.SQLException;
import java.sql.Statement;

public class DaoProduct {

    public void addProduct(Product product) {
        String query = "INSERT INTO mydb.products (POINT_ID, PRICE, AMOUNT, NAME , DESCRIPTION) VALUES" +
                " ()";

        try {
            Statement statement = Connector.getConnection().createStatement();
            statement.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Connector.closeConnection();
        }
    }
}
