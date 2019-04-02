package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "rights")
public class Right implements Serializable {
    @Id
    @Column
    private long rightId;
    @Column
    private String rightName;
    @ManyToOne
    private Role role;

}
