package dao;

import models.PointOfSale;
import utils.Connector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoPointOfSale {

    public static PointOfSale getPointByPointId(String pointId) {
        String query = "SELECT * FROM mydb.points WHERE NAME='" + pointId+"'";

        PointOfSale point = new PointOfSale();

        try {
            Statement statement = new Connector().getConnection().createStatement();
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                point.setId(rs.getLong("ID"));
                point.setAddressId(rs.getLong("ADDRESS_ID"));
                point.setName(rs.getString("NAME"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return point;
    }
}
