package WUT.dbWoodenProject.controller.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;


@Getter
@Builder
public class COrderDto {

    private long id;
    private long invoiceId;
    private LocalDateTime orderDate;
    private String currency;
    private String currencyCode;
    private String discount;
    private String totalBrutto;

}
