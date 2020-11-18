package WUT.dbWoodenProject.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
//@Table(name = "Invoice")
@Getter
@Setter
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   // @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

  //  @ManyToOne
 //   @JoinColumn(name="company_id")
    private long companyId;


    // @OneToMany(cascade = CascadeType.REMOVE)
    // @JoinColumn(name = "invoiceId", updatable = false, insertable = false)
    //List<Order> orders;

    @Column(name = "date_start", nullable = false)
    private LocalDateTime dateStart;

    @Column(name = "date_end", nullable = false)
    private LocalDateTime dateEnd;

    @Column(name = "netto", nullable = false)
    private String netto;

    @Column(name = "brutto", nullable = false)
    private String brutto;

    @Column(name = "tax", nullable = false)
    private String tax;

}
