package WUT.dbWoodenProject.controller.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ItemDto {
    private String name;
    private String description;
    private String price;
    private long numberInStock;
}
