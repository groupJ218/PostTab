package models;

import lombok.*;

import javax.naming.directory.SearchResult;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "carts")
public class Cart implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private long id;

    @Column(name = "USER_ID", nullable = false, length = 300)
    private long userId;

    @OneToMany (mappedBy = "cart")
    private List<Product> productsInCart = new ArrayList<>();

    public Cart(long userId) {
        this.userId = userId;
    }

    public Cart() {
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", userId=" + userId +
                ", productsInCart=" + productsInCart +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public List<Product> getProductsInCart() {
        return productsInCart;
    }

    public void setProductsInCart(List<Product> productsInCart) {
        this.productsInCart = productsInCart;
    }
}