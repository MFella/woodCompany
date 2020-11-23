package WUT.dbWoodenProject.repository;

import WUT.dbWoodenProject.model.COrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderRepository extends JpaRepository<COrder, Long> {

    @Query("SELECT o FROM COrder o" )
    List<COrder> findAllOrders();

    @Procedure("update_totals")
    void updateTotalsOfOrders();

    @Query("SELECT o FROM COrder o WHERE o.id = :id")
    COrder findOrderById(@Param("id")long id);
}
