package WUT.dbWoodenProject.repository;

import WUT.dbWoodenProject.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

    @Query("Select orderitem FROM OrderItem orderitem")
    public List<OrderItem> findAll();

    @Query("Select orderitem FROM OrderItem orderitem WHERE orderitem.orderId = :id")
    public List<OrderItem> findAllByOrderId(@Param("id") long id);

}
