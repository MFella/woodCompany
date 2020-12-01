package WUT.dbWoodenProject.repository;


import WUT.dbWoodenProject.model.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Long> {

    List<Shipment> findAllBysubunitIdIn(List<Long> ids);

    @Query("SELECT shipment FROM Shipment shipment WHERE shipment.subunitId = :subunitId")
    List<Shipment> findAllBySubunitId(@Param("subunitId") long subunitId);

    @Query("SELECT shipment FROM Shipment shipment WHERE shipment.DeliveryType = :deltype")
    List<Shipment> findAllByDeliveryType(@Param("deltype")String deltype);
}
