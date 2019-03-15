package models;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;


@Entity
@Table(name = "products_")
public class Product implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private long id;
    @Column(name = "POINT_ID")
    private long pointId;
    @Column(name = "PRICE")
    private double price;
    @Column(name = "AMOUNT")
    private double amount;
    @Column(name = "NAME")
    private String name;
    @Column(name = "DESCRIPTION")
    private String description;
    @ManyToOne
    private Cart cart;

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPointId() {
        return pointId;
    }

    public void setPointId(long pointId) {
        this.pointId = pointId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Product() {
    }

    public Product(long pointId, double price, double amount, String name, String description) {
        this.pointId = pointId;
        this.price = price;
        this.amount = amount;
        this.name = name;
        this.description = description;
    }

    public Product(long id, long pointId, double price, double amount, String name, String description) {
        this.id = id;
        this.pointId = pointId;
        this.price = price;
        this.amount = amount;
        this.name = name;
        this.description = description;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", pointId=" + pointId +
                ", price=" + price +
                ", amount=" + amount +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getId() == product.getId() &&
                getPointId() == product.getPointId() &&
                Double.compare(product.getPrice(), getPrice()) == 0 &&
                Double.compare(product.getAmount(), getAmount()) == 0 &&
                Objects.equals(getName(), product.getName()) &&
                Objects.equals(getDescription(), product.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getPointId(), getPrice(), getAmount(), getName(), getDescription());
    }
}