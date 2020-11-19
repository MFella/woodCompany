package WUT.dbWoodenProject.repository;


import WUT.dbWoodenProject.model.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Long> {

    List<Shipment> findAllBysubunitIdIn(List<Long> ids);
}
