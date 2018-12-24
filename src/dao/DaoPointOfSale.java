package dao;

import models.PointOfSale;
import utils.Connector;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoPointOfSale {
    public static PointOfSale getPointByPointId(long pointId) {
        PointOfSale point = new PointOfSale();
        String query = "SELECT * FROM mydb.points WHERE ID=" + pointId;

        try {
            Statement statement = Connector.getConnection().createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                point.setId(rs.getLong("ID"));
                point.setAddressId(rs.getLong("ADDRESS_ID"));
                point.setName(rs.getString("NAME"));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Connector.closeConnection();
        }
        return point;
    }
}
