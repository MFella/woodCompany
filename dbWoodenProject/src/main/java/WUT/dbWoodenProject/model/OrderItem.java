package WUT.dbWoodenProject.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="orderitem")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private long orderId;

    //private long itemId;

    @OneToOne(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    @JoinColumn(name = "ItemId")
    private Item item;

    @Column(name="quantity")
    private Integer Quantity;

}
