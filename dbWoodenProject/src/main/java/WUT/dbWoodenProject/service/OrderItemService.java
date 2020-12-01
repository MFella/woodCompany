package WUT.dbWoodenProject.service;

import WUT.dbWoodenProject.controller.dto.OrderItemDto;
import WUT.dbWoodenProject.model.COrder;
import WUT.dbWoodenProject.model.Item;
import WUT.dbWoodenProject.model.OrderItem;
import WUT.dbWoodenProject.repository.ItemRepository;
import WUT.dbWoodenProject.repository.OrderItemRepository;
import WUT.dbWoodenProject.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderItemService {

    private final OrderItemRepository orderItemRepository;
    private final ItemRepository itemRepository;
    private final OrderRepository orderRepository;

    public boolean addOrderItem(OrderItemDto orderItemDto)
    {
        COrder order = orderRepository.findOrderById(orderItemDto.getOrderId());
        Item item = itemRepository.findById(orderItemDto.getItemId()).orElse(new Item());



        if(item== null || order == null)
        {
            return false;

        }else if(orderItemDto.getQuantity() == null)
        {
            return false;

        } else if(item.getNumberInStock() == 0) {
            return false;
        }
        else
        {
//
//            OrderItem orderItemFromRepo = orderItemRepository
//                    .findOrderItemByItemAndOrderId(orderItemDto.getOrderId(), orderItemDto.getItemId());
//
//            if(orderItemFromRepo != null)
//            {
//                orderItemFromRepo.setQuantity(orderItemDto.getQuantity().intValue());
//            }

            OrderItem orderItem = new OrderItem();
            orderItem.setQuantity(orderItemDto.getQuantity().intValue());
            orderItem.setItem(item);
            orderItem.setOrderId(order.getId());

            orderItemRepository.save(orderItem);
            return true;
        }


    }
}
