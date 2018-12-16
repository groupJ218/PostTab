package TestPackage;

import java.util.ArrayList;
import java.util.Date;

public class User {

    private boolean isBlock;
    private long id;
    private long AddressId;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String login;
    private String phone;
    private String lastIP;
    private Date registerDate;
    private Date lastLoginDate;
    private ArrayList<Role> roles;
    private ArrayList<Cart> carts;
    private ArrayList<PointOfSale> points;
    private ArrayList<Order> orders;

}
