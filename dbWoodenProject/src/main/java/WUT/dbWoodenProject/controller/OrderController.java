package WUT.dbWoodenProject.controller;

import WUT.dbWoodenProject.controller.dto.COrderDto;
import WUT.dbWoodenProject.model.COrder;
import WUT.dbWoodenProject.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class OrderController {

    private final OrderService orderService;

    @GetMapping("/orders")
    public List<COrder> findAllOrders()
    {
        return orderService.findAllOrders();
    }

    @GetMapping("/ordersWithUpdate")
    public List<COrder> findAllOrdersWithUpdate()
    {
        return orderService.findAllOrdersWithProcedure();
    }

    @GetMapping("/orders/{id}")
    public COrder findOrderById(@PathVariable long id)
    {
        return orderService.findOrderById(id);

    }

    @PostMapping("/orders")
    public COrder addOrder(@RequestBody COrderDto corderDto)
    {
        return orderService.save(corderDto);
    }
}
