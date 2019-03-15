package models;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long roleId;
    @Column
    private boolean isDefault;
    @Column
    private String roleName;
    @ManyToOne
    private User user;
    @OneToMany(mappedBy = "role")
    private ArrayList<Right> rights;


}
