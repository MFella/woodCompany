package WUT.dbWoodenProject.service;

import WUT.dbWoodenProject.model.COrder;
import WUT.dbWoodenProject.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;


    public List<COrder> findAllOrders()
    {
        return orderRepository.findAllOrders();
    }

    public List<COrder> findAllOrdersWithProcedure()
    {
        orderRepository.updateTotalsOfOrders();
        return orderRepository.findAllOrders();
    }

}
