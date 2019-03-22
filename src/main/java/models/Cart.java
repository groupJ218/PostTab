package models;

import lombok.*;

import javax.naming.directory.SearchResult;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "carts")
public class Cart implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long cartId;
    @OneToOne
    private User user;
    @OneToMany(mappedBy = "cart")
    private List<Product> productsInCart = new ArrayList<>();

}