package models;

import dao.DaoProduct;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "points")
public class PointOfSale implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long pointId;
    @Column
    private String name;
    @ManyToMany
    private List<User> users = new ArrayList<>();
    @ManyToMany
    private List<Product> products = new ArrayList<>();
    @OneToMany(mappedBy = "point")
    private List<Order> orders = new ArrayList<>();

}
