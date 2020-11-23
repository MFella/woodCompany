package WUT.dbWoodenProject.repository;


import WUT.dbWoodenProject.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

    List<Invoice> findAllByCompanyIdIn(List<Long> ids);

    @Query("SELECT invoice FROM Invoice invoice WHERE invoice.companyId = :id " +
            "ORDER BY invoice.dateStart ASC")
    List<Invoice> findByCompanyIdOrderByDateStartAsc(@Param("id") Long id);

    @Query("Select invoice FROM Invoice invoice WHERE :year_start < invoice.dateStart AND invoice.dateStart < :year_end")
    List<Invoice> findByStartDateBetween(@Param("year_start") LocalDateTime year_start, @Param("year_end") LocalDateTime year_end);

    @Query("SELECT invoice FROM Invoice invoice WHERE invoice.id = :id")
    Invoice findOneInvoice(@Param("id") long id);

    Invoice updateInvoice(long id);
}
