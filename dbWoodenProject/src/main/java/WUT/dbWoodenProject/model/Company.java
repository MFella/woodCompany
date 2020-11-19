package WUT.dbWoodenProject.model;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Company")
@Getter
@Setter
@RequiredArgsConstructor
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "companyId", updatable = false, insertable = false)
    private List<Invoice> invoice;

    @Column(name = "company_name", nullable = false)
    private String name;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "country", nullable = false)
    private String country;

    @Column(name = "nip", nullable = false)
    private String nip;

}
