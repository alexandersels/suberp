package www.schwiblies.be.backend.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class User {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;
}
