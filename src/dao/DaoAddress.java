package dao;

import models.Address;
import utils.Connector;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoAddress {

    public static void addAddress(Address address) {
        String query = "INSERT INTO mydb.addresses (COUNTRY, REGION, CITY, DISTRICT, STREET, HOUSE_NUMB, INDEX_)" +
                "VALUES (?, ?, ?, ?, ?, ?, ?);";
        try {
            PreparedStatement ps = Connector.getConnection().prepareStatement(query);
            ps.setString(1, address.getCountry());
            ps.setString(2, address.getRegion());
            ps.setString(3, address.getCity());
            ps.setString(4, address.getDistrict());
            ps.setString(5, address.getStreet());
            ps.setString(6, address.getHouseNumb());
            ps.setString(7, address.getIndex());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
