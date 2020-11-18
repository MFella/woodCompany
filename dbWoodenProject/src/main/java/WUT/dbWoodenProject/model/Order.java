package WUT.dbWoodenProject.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name="order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long invoiceId;

    @Column(name="order_date", nullable = false)
    private LocalDateTime OrderDate;

    @Column(name="currency")
    private String Currency;

    @Column(name="currency_code", nullable = false)
    private String CurrencyCode;

    @Column(name="discount")
    private String Discount;

    @Column(name="total_brutto")
    private String TotalBrutto;

    //@Column(name="orderItem")
    //List<OrderItem> orderItems;

}
