package WUT.dbWoodenProject.service;

import WUT.dbWoodenProject.model.Shipment;
import WUT.dbWoodenProject.repository.ShipmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShipmentService {

    private final ShipmentRepository shipmentRepository;

    public List<Shipment> findAllBySubunitId(long id)
    {
        return shipmentRepository.findAllBySubunitId(id);
    }

    public List<Shipment> findAllByDeliveryType(String inpost)
    {
        return shipmentRepository.findAllByDeliveryType(inpost);
    }
}
