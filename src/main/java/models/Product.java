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
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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
    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "productId")
    private Cart cart;
    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "productId")
    private Order order;
    @ManyToMany
    private List<PointOfSale> points = new ArrayList<>();


}