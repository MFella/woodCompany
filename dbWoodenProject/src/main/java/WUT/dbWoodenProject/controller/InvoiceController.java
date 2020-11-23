package WUT.dbWoodenProject.controller;


import WUT.dbWoodenProject.model.Invoice;
import WUT.dbWoodenProject.service.InvoiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class InvoiceController {

    private final InvoiceService invoiceService;

    @GetMapping("/invoices/period/{dateStart}/{dateEnd}")
    public List<Invoice> findByStartDateBetween(@PathVariable String dateStart, @PathVariable String dateEnd)
    {

        return invoiceService.findByStartDateBetween(dateStart, dateEnd);
    }

    @GetMapping("/invoices/{id}")
    public Invoice findOneInvoice(@PathVariable long id)
    {
        return invoiceService.findOneInvoice(id);
    }

//    @PostMapping("/invoices/update/{id}")
//    public Invoice updateInvoice(@PathVariable long id)
//    {
//        return invoiceService.updateInvoice(id);
//    }

}
