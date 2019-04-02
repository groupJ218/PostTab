package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column
    private long orderId;
    @Column
    private double sum;
    @Column
    private Date date;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;
    @ManyToOne
    private PointOfSale point;
    @OneToMany(mappedBy = "order", fetch = FetchType.EAGER)
    private List<Product> products = new ArrayList<>();


}
