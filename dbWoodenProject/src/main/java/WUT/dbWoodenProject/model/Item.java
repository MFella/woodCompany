package WUT.dbWoodenProject.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="Item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="name")
    private String Name;

    @Column(name="description")
    private String Description;

    @Column(name="price")
    private String Price;

    @Column(name="number_in_stock")
    private long NumberInStock;
}
