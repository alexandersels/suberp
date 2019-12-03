package www.schwiblies.be.backend.domain;

import lombok.Data;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Data
public class Subscription {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private String category;

    @Column
    private long price;

    @Column
    private String nextPayment;

    @Column
    private int cycle;

    @Column
    private String paymentMethod;

}
