package WUT.dbWoodenProject.controller.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CompanyDto {

    private long id;
    private String name;
    private String city;
    private String country;
    private String nip;
}
