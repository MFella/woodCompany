package WUT.dbWoodenProject.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne(mappedBy = "item")
    private OrderItem orderItem;

    @Column(name="name")
    private String Name;

    @Column(name="description")
    private String Description;

    @Column(name="price")
    private String Price;

    @Column(name="number_in_stock")
    private long NumberInStock;
}
