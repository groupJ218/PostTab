package dao;

import models.Right;
import utils.Connector;

import java.sql.*;
import java.util.ArrayList;

public class DaoRights {

    public static void addRight(Right right) {
        String query = "INSERT INTO mydb.rights (NAME) values ('" + right.getName() + "')";

        try {
            Statement statement = new Connector().getConnection().createStatement();
            statement.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Right getById(long id) {
        String query = "SELECT * from mydb.rights WHERE ID=" + id;
        Right right = new Right();
        try {
            Statement statement = new Connector().getConnection().createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                right.setId(rs.getLong("ID"));
                right.setName(rs.getString("NAME"));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Connector.closeConnection();
        }
        return right;
    }

    public static ArrayList<Right> getListById(ArrayList<Long> id) {
        String query = "SELECT * from mydb.rights WHERE ID = ?";
        ArrayList<Right> rights = new ArrayList<Right>();

        try {
            PreparedStatement ps = new Connector().getConnection().prepareStatement(query);
            ps.setArray(1, (Array) id);
            ResultSet rs = ps.executeQuery();
//            rights.addAll();
            createListRights(rights, rs);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Connector.closeConnection();
        }
        return rights;
    }

    public static ArrayList<Right> getAll() {
        String query = "SELECT * from mydb.rights";
        ArrayList<Right> rights = new ArrayList<Right>();

        try {
            Statement st = new Connector().getConnection().createStatement();
            ResultSet rs = st.executeQuery(query);
            createListRights(rights, rs);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Connector.closeConnection();
        }
        return rights;
    }

    private static void createListRights(ArrayList<Right> rights, ResultSet rs) throws SQLException {
        while (rs.next()) {
            Right right = new Right();
            right.setId(rs.getLong("ID"));
            right.setName(rs.getString("NAME"));
            rights.add(right);
        }
    }


    public static void deleteById(long id) {
        String query = "DELETE FROM mydb.rights WHERE ID=" + id;
        executeStringQuery(query);
    }

    public static void updateById(long id, String name) {

        String query = "UPDATE  mydb.rights SET NAME='" + name + "' WHERE ID=" + id;
        executeStringQuery(query);

    }

    private static void executeStringQuery(String query) {
        try {
            Statement st = new Connector().getConnection().createStatement();
            st.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Connector.closeConnection();
        }
    }
}
