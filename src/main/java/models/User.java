package models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

@Entity
@Table
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long userId;
    @Column
    private boolean isBlock;
    @Column
    private long AddressId;
    @Column
    private String password;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String email;
    @Column
    private String login;
    @Column
    private String phone;
    @Column
    private String lastIP;
    @Column
    private Date registerDate;
    @Column
    private Date lastLoginDate;
    @OneToMany(mappedBy = "user")
    private ArrayList<Role> roles;
    @OneToMany(mappedBy = "user")
    private ArrayList<Cart> carts;
    @OneToMany(mappedBy = "user")
    private ArrayList<PointOfSale> points;
    @OneToMany(mappedBy = "user")
    private ArrayList<Order> orders;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", isBlock=" + isBlock +
                ", AddressId=" + AddressId +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", login='" + login + '\'' +
                ", phone='" + phone + '\'' +
                ", lastIP='" + lastIP + '\'' +
                ", registerDate=" + registerDate +
                ", lastLoginDate=" + lastLoginDate +
                ", roles=" + roles +
                ", carts=" + carts +
                ", points=" + points +
                ", orders=" + orders +
                '}';
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public boolean isBlock() {
        return isBlock;
    }

    public void setBlock(boolean block) {
        isBlock = block;
    }

    public long getAddressId() {
        return AddressId;
    }

    public void setAddressId(long addressId) {
        AddressId = addressId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLastIP() {
        return lastIP;
    }

    public void setLastIP(String lastIP) {
        this.lastIP = lastIP;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public ArrayList<Role> getRoles() {
        return roles;
    }

    public void setRoles(ArrayList<Role> roles) {
        this.roles = roles;
    }

    public ArrayList<Cart> getCarts() {
        return carts;
    }

    public void setCarts(ArrayList<Cart> carts) {
        this.carts = carts;
    }

    public ArrayList<PointOfSale> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<PointOfSale> points) {
        this.points = points;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public User() {
    }

    public User(boolean isBlock, long addressId, String password, String firstName, String lastName, String email, String login, String phone, String lastIP, Date registerDate, Date lastLoginDate) {
        this.isBlock = isBlock;
        AddressId = addressId;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.login = login;
        this.phone = phone;
        this.lastIP = lastIP;
        this.registerDate = registerDate;
        this.lastLoginDate = lastLoginDate;
    }
}
