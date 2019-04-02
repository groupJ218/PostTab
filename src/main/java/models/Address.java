package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import net.bytebuddy.build.ToStringPlugin;

import javax.persistence.*;
import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString(exclude = "user")
@Table(name = "addresses")
public class Address implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "addressId")
    private long addressId;
    @Column
    private String country;
    @Column
    private String region;
    @Column
    private String city;
    @Column
    private String district;
    @Column
    private String street;
    @Column
    private String houseNumb;
    @Column(name = "index_")
    private String index;
    @OneToOne (fetch = FetchType.LAZY)
    @JoinColumn (name="userId")
    private User user;
}