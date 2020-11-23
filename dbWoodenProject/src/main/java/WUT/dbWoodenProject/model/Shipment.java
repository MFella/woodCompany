package WUT.dbWoodenProject.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@Table(name="shipment")
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //@Column(name="orderId")
    private long orderId;

    @Column(name="subunit_id")
    private long subunitId;

    @Column(name="delivery_cost")
    private String DeliveryCost;

    @Column(name="delivery_type")
    private String DeliveryType;

    @Column(name="delivery_date")
    private LocalDateTime DeliveryDate;

}
