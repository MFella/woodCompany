package WUT.dbWoodenProject.controller;

import WUT.dbWoodenProject.controller.dto.CompanyDto;
import WUT.dbWoodenProject.controller.dto.SubunitDto;
import WUT.dbWoodenProject.model.Company;
import WUT.dbWoodenProject.model.Subunit;

import java.util.List;
import java.util.stream.Collectors;

public class DtoMapper {

    private DtoMapper(){}

    public static List<CompanyDto> mapToCompanyDtos(List<Company> companies) {
        return companies.stream()
                .map(company -> mapToCompanyDto(company))
                .collect(Collectors.toList());
    }

    private static CompanyDto mapToCompanyDto(Company company) {
        return CompanyDto.builder()
                .id(company.getId())
                .city(company.getCity())
                .name(company.getName())
                .country(company.getCountry())
                .nip(company.getNip())
                .build();
    }

    public static List<SubunitDto> mapToSubunitDto(List<Subunit> subunits)
    {
        return subunits.stream()
                .map(subunit -> mapToSubunitDto(subunit))
                .collect(Collectors.toList());
    }

    private static SubunitDto mapToSubunitDto(Subunit subunit)
    {
        return SubunitDto.builder()
                .id(subunit.getId())
                .Country(subunit.getCountry())
                .City(subunit.getCity())
                .Postcode(subunit.getPostcode())
                .Street(subunit.getStreet())
                .build();
    }


}
