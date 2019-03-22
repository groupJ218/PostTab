package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "addresses")
public class Address implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
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
    @Column
    private String index;
    @OneToOne
    private User user;
}