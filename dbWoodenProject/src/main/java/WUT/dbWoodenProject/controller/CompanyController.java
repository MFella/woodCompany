package WUT.dbWoodenProject.controller;

import WUT.dbWoodenProject.controller.dto.CompanyDto;
import WUT.dbWoodenProject.model.Company;
import WUT.dbWoodenProject.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class CompanyController {

    private final CompanyService companyService;

    @GetMapping("/companies")
    public List<CompanyDto> getCompanies(@RequestParam(required = false) Integer page, Sort.Direction sort)
    {
        int pageNumber = page != null && page >= 0 ? page : 0;
        Sort.Direction sortDirection = sort != null ? sort : Sort.Direction.ASC;
        //throw new IllegalArgumentException("Not implemented yet!");
        return DtoMapper.mapToCompanyDtos(companyService.getCompanies(pageNumber, sortDirection));
    }

    @GetMapping("/companies/invoices")
    public List<Company> getCompaniesWithInvoices(@RequestParam(required = false) Integer page, Sort.Direction sort)
    {
        int pageNumber = page != null && page >= 0 ? page : 0;
        Sort.Direction sortDirection = sort != null ? sort : Sort.Direction.ASC;
        //throw new IllegalArgumentException("Not implemented yet!");
        return companyService.getCompaniesWithInvoices(pageNumber, sortDirection);
    }

    @GetMapping("/companies/{id}")
    public Company getCompany(@PathVariable("id") long id)
    {
        return companyService.getCompany(id);
    }

    @PostMapping("/companies")
    public Company addCompany(@RequestBody Company company)
    {
        return companyService.addCompany(company);
    }

    @PutMapping("/companies")
    public Company editCompany(@RequestBody Company company)
    {
        return companyService.editCompany(company);
    }

    @DeleteMapping("/companies/{id}")
    public void deleteCompany(@PathVariable long id)
    {
        companyService.deleteCompany(id);
    }

}



