package WUT.dbWoodenProject.repository;

import WUT.dbWoodenProject.model.COrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;

import java.util.List;

public interface OrderRepository extends JpaRepository<COrder, Long> {

    @Query("SELECT o FROM COrder o" )
    List<COrder> findAllOrders();

    @Procedure("update_totals")
    void updateTotalsOfOrders();

}
