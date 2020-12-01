package WUT.dbWoodenProject.controller.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class OrderItemDto {

    private Long orderId;
    private Long itemId;
    private Long quantity;
}
