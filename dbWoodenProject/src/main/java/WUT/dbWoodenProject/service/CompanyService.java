package WUT.dbWoodenProject.service;

import WUT.dbWoodenProject.model.Company;
import WUT.dbWoodenProject.model.Invoice;
import WUT.dbWoodenProject.repository.CompanyRepository;
import WUT.dbWoodenProject.repository.InvoiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;
    private static final int PAGE_SIZE  = 2;
    private final InvoiceRepository invoiceRepository;

    // Sort.by(Sort.Order.asc("id"), Sort.Order.desc("nip"))

    public List<Company> getCompanies(int page, Sort.Direction sort) {
        return companyRepository.findAllCompanies(
                PageRequest.of(page, PAGE_SIZE,
                        Sort.by(sort, "id")));
    }

    public Company getCompany(long id)
    {
        return companyRepository.findById(id)
                .orElseThrow();
    }

    public List<Company> getCompaniesWithInvoices(int page, Sort.Direction sort) {

        List<Company> allCompanies =  companyRepository.findAllCompanies(
                PageRequest.of(page, PAGE_SIZE,
                        Sort.by(sort, "id")));
        List<Long> ids = allCompanies.stream()
                .map(Company::getId)
                .collect(Collectors.toList());
        //List<Invoice> invoices = invoiceRepository.findAllByCompanyIdIn(ids);
        List<Invoice> invoices = invoiceRepository.findAllByCompanyIdIn(ids);
        allCompanies.forEach(company -> company.setInvoice(extractInvoices(invoices, company.getId())));
        return allCompanies;
    }

    private List<Invoice> extractInvoices(List<Invoice> invoices, long id) {
        return invoices.stream()
                .filter(invoice -> invoice.getCompanyId() == id)
                .collect(Collectors.toList());
    }

    public Company getCompanyWithSortedASCInvoices(long id)
    {
        Company company = companyRepository.findById(id).orElseThrow();
        List<Invoice> invoices = invoiceRepository.findByCompanyIdOrderByDateStartAsc(id);

        company.setInvoice(invoices);
        return company;
    }

    public Company addCompany(Company company) {
        return companyRepository.save(company);
    }

    //transakcje
    @Transactional
    public Company editCompany(Company company) {
        Company companyedited = companyRepository.findById(company.getId()).orElseThrow();

        companyedited.setCity(company.getCity());
        companyedited.setCountry(company.getCountry());
        companyedited.setName(company.getName());
        companyedited.setNip(company.getNip());

        return companyedited;
    }

    public void deleteCompany(long id) {
        companyRepository.deleteById(id);
    }
}
