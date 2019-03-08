package models;

import lombok.*;

import javax.naming.directory.SearchResult;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Map;

@Entity
@Table(name = "carts_")
public class Cart implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private long id;

    @Column(name = "USER_ID", nullable = false, length = 300)
    private long userId;

//    Map<Long, Double> productsInCart;
//
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
                '}';
    }

    //
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public long getUserId() {
//        return userId;
//    }
//
//    public void setUserId(long userId) {
//        this.userId = userId;
//    }
}
