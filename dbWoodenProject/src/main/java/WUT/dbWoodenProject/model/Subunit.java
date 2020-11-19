package WUT.dbWoodenProject.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "Subunit")
public class Subunit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "company_id")
    private long companyId;

    @Column(name = "country")
    private String Country;

    @Column(name = "city")
    private String City;

    @Column(name = "postcode")
    private String Postcode;

    @Column(name = "street")
    private String Street;

    @OneToMany(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "subunit_id", updatable = false, insertable = false)
    private List<Shipment> shipments;

}
