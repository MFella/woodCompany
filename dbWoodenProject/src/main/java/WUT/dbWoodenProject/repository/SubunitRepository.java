package WUT.dbWoodenProject.repository;

import WUT.dbWoodenProject.model.Subunit;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubunitRepository extends JpaRepository<Subunit, Long> {
    @Query("Select s from Subunit s ")
    List<Subunit> findAllSubunits(Pageable page);

    @Query("Select s from Subunit s WHERE s.id = :id")
    List<Subunit> findAllByCompanyId(@Param("id") long id);
}
