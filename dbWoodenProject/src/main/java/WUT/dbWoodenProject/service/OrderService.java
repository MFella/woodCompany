package WUT.dbWoodenProject.service;

import WUT.dbWoodenProject.controller.dto.COrderDto;
import WUT.dbWoodenProject.model.COrder;
import WUT.dbWoodenProject.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
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

    public COrder findOrderById(long id) {
        return orderRepository.findOrderById(id);
    }

    public COrder save(COrderDto corderDto) {

        COrder corder = new COrder();
        corder.setCurrency(corderDto.getCurrency());
        corder.setCurrencyCode(corderDto.getCurrencyCode());
        corder.setDiscount(corderDto.getDiscount());
        corder.setInvoiceId(corderDto.getInvoiceId());
        corder.setOrderDate(corderDto.getOrderDate());
        corder.setTotalBrutto(corderDto.getTotalBrutto());
        corder.setId(corderDto.getId());

        corder.setOrderItems(Collections.emptyList());
        corder.setShipment(Collections.emptyList());

        return orderRepository.save(corder);
    }
}
