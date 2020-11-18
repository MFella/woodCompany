package WUT.dbWoodenProject.repository;


import WUT.dbWoodenProject.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

    List<Invoice> findAllByCompanyIdIn(List<Long> ids);
}
