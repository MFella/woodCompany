package WUT.dbWoodenProject.controller.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SubunitDto {

    private long id;
    private String Country;
    private String City;
    private String Postcode;
    private String Street;

}
