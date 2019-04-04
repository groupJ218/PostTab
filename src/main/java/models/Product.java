package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long productId;
    @Column
    private double price;
    @Column
    private double amount;
    @Column
    private String name;
    @Column
    private String description;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "cartId")
    private Cart cart;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "orderId")
    private Order order;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name="products_points",
            joinColumns=@JoinColumn(name="productId"),
            inverseJoinColumns=@JoinColumn(name="pointId"))
    private List<PointOfSale> points = new ArrayList<>();


}