package WUT.dbWoodenProject.controller;

import WUT.dbWoodenProject.controller.dto.*;
import WUT.dbWoodenProject.model.Company;

import java.util.List;
import java.util.stream.Collectors;

public class CompanyDtoMapper {

    private CompanyDtoMapper(){}

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
}
