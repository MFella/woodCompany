package WUT.dbWoodenProject.repository;


import WUT.dbWoodenProject.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

    List<Invoice> findAllByCompanyIdIn(List<Long> ids);

    @Query("SELECT invoice FROM Invoice invoice WHERE invoice.companyId = :id " +
            "ORDER BY invoice.dateStart ASC")
    List<Invoice> findByCompanyIdOrderByDateStartAsc(@Param("id") Long id);
}
