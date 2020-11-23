package WUT.dbWoodenProject.controller;


import WUT.dbWoodenProject.model.Shipment;
import WUT.dbWoodenProject.service.ShipmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ShipmentController {

    private final ShipmentService shipmentService;

    @GetMapping("/shipments/forSubunit/{id}")
    public List<Shipment> findAllBySubunitId(@PathVariable long id)
    {
        return shipmentService.findAllBySubunitId(id);
    }
}
