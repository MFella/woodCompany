package WUT.dbWoodenProject.service;

import WUT.dbWoodenProject.model.Invoice;
import WUT.dbWoodenProject.repository.InvoiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class InvoiceService {

    private final InvoiceRepository invoiceRepository;


    public List<Invoice> findByStartDateBetween(String dateStart, String dateEnd){
        List<String> splittedFirst = Arrays.asList(dateStart.split("-"));
        List<String> splittedSecond = Arrays.asList(dateEnd.split("-"));

        LocalDateTime d1 = LocalDateTime.of(Integer.parseInt(splittedFirst.get(0)),
                getMonth(Integer.parseInt(splittedFirst.get(1))),
                Integer.parseInt(splittedFirst.get(2)), 0, 0, 0);

        LocalDateTime d2 = LocalDateTime.of(Integer.parseInt(splittedSecond.get(0)),
                getMonth(Integer.parseInt(splittedSecond.get(1))),
                Integer.parseInt(splittedSecond.get(2)), 0, 0, 0);

        return invoiceRepository.findByStartDateBetween(d1, d2);

    }

    public Invoice findOneInvoice(long id)
    {
        return invoiceRepository.findOneInvoice(id);
    }

    private Month getMonth(Integer number)
    {
        switch(number){
            case 1:
                return Month.JANUARY;
            case 2:
                return Month.FEBRUARY;
            case 3:
                return Month.MARCH;
            case 4:
                return Month.APRIL;
            case 5:
                return Month.MAY;
            case 6:
                return Month.JUNE;
            case 7:
                return Month.JULY;
            case 8:
                return Month.AUGUST;
            case 9:
                return Month.SEPTEMBER;
            case 10:
                return Month.OCTOBER;
            case 11:
                return Month.NOVEMBER;
            case 12:
                return Month.DECEMBER;
        }

        return Month.APRIL;
    }

//    public Invoice updateInvoice(Float newTax, long id) {
//
//        return invoiceRepository.updateInvoice(newTax, id);
//    }
}
