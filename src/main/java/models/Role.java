package models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table (name = "roles")
public class Role implements Serializable {
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
    @OneToMany (mappedBy = "role")
    private List<Right> rights = new ArrayList<>();

}
