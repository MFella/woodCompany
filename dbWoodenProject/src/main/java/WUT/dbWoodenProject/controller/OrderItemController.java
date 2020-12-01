package WUT.dbWoodenProject.controller;

import WUT.dbWoodenProject.controller.dto.OrderItemDto;
import WUT.dbWoodenProject.service.OrderItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderItemController {

    private final OrderItemService orderItemService;

    @PostMapping("/orderitems/")
    public boolean addOrderItem(@RequestBody OrderItemDto orderItemDto)
    {
        return orderItemService.addOrderItem(orderItemDto);
    }
}
