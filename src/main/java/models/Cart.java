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
@ToString(exclude = "user")
@Entity
@Table(name = "carts")
public class Cart implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long cartId;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "userId")
    private User user;

    @OneToMany(mappedBy = "cart",fetch=FetchType.LAZY)
    private List<Product> productsInCart = new ArrayList<>();
}