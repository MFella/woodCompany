package WUT.dbWoodenProject.repository;

import WUT.dbWoodenProject.model.Company;
import WUT.dbWoodenProject.model.Invoice;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends JpaRepository<Company,Long> {

    @Query("Select c from Company c ")
    List<Company> findAllCompanies(Pageable page);
}
