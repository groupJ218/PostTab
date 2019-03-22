package dao;

import models.Product;
import utils.Connector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DaoProduct {

    public static ArrayList<Product> getProdByPointId(long pointId) {
        ArrayList<Product> products = new ArrayList<>();
        String query = "SELECT * FROM mydb.products WHERE POINT_ID=" + pointId;

        return getProductsFromDB(products, query);
    }

    public static Product getProdById(long Id) {
        ArrayList<Product> products = new ArrayList<>();
        String query = "SELECT * FROM mydb.products WHERE ID=" + Id;
        return getProductsFromDB(products, query).get(0);
    }

    public static void addProduct(Product product) {
        String query = "INSERT INTO mydb.products (POINT_ID, PRICE, AMOUNT, NAME , DESCRIPTION) VALUES (?,?,?,?,?)";

        try {
            PreparedStatement ps = new Connector().getConnection().prepareStatement(query);
            ps.setLong(1, product.getProductId());
            ps.setDouble(2, product.getPrice());
            ps.setDouble(3, product.getAmount());
            ps.setString(4, product.getName());
            ps.setString(5, product.getDescription());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Connector.closeConnection();
        }
    }

    public static ArrayList<Product> getAll() {
        ArrayList<Product> products = new ArrayList<>();
        String query = "SELECT * FROM mydb.products";
        try {
            Statement st = new Connector().getConnection().createStatement();
            ResultSet rs = st.executeQuery(query);
            int count = 0;
            while (rs.next()) {
                System.out.println(count++);
                Product product = new Product();
                product.setProductId(rs.getLong("ID"));
                product.setPrice(rs.getDouble("PRICE"));
                product.setAmount(rs.getDouble("AMOUNT"));
                product.setName(rs.getString("NAME"));
                product.setDescription(rs.getString("DESCRIPTION"));
                products.add(product);
            }
            System.out.println("getAll Method" + products.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    private static ArrayList<Product> getProductsFromDB(ArrayList<Product> products, String query) {
        try {
            Statement st = new Connector().getConnection().createStatement();
            ResultSet rs = st.executeQuery(query);
            int count = 0;
            while (rs.next()) {
                System.out.println(count++);
                Product product = new Product();
                product.setPrice(rs.getDouble("PRICE"));
                product.setAmount(rs.getDouble("AMOUNT"));
                product.setName(rs.getString("NAME"));
                product.setDescription(rs.getString("DESCRIPTION"));
                products.add(product);
            }
            System.out.println("getAll Method" + products.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }
}
