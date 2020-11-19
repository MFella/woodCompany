package WUT.dbWoodenProject.service;


import WUT.dbWoodenProject.model.Shipment;
import WUT.dbWoodenProject.model.Subunit;
import WUT.dbWoodenProject.repository.ShipmentRepository;
import WUT.dbWoodenProject.repository.SubunitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SubunitService {

    private final SubunitRepository subunitRepository;
    private final ShipmentRepository shipmentRepository;
    private final int PAGE_SIZE = 5;

    public List<Subunit> getSubunits(int page, Sort.Direction sort) {
        return subunitRepository.findAllSubunits(
                PageRequest.of(page, PAGE_SIZE,
                        Sort.by(sort, "id")));

    }

    public List<Subunit> getSubunitsWithShipments(int pageNumber, Sort.Direction sortDirection) {

        List<Subunit> allSubunits = subunitRepository.findAllSubunits(
                PageRequest.of(pageNumber, PAGE_SIZE,
                        Sort.by(sortDirection, "id")));

        List<Long> ids = allSubunits.stream()
                    .map(Subunit::getId)
                    .collect(Collectors.toList());
        List<Shipment> shipments = shipmentRepository.findAllBysubunitIdIn(ids);

        allSubunits.forEach(el -> el.setShipments(extractShipments(shipments, el.getId())));
        return allSubunits;
    }

    private List<Shipment> extractShipments(List<Shipment> shipments, long id) {

        return shipments.stream()
                .filter(el -> el.getSubunitId() == id)
                .collect(Collectors.toList());
    }

    public Subunit getSubunitById(long id) {
        return subunitRepository.findById(id)
                .orElseThrow();
    }

    public Subunit addSubunit(Subunit subunit) {
        return subunitRepository.save(subunit);
    }

    @Transactional
    public Subunit updateSubunit(Subunit subunit) {
        Subunit subFromRepo = subunitRepository.findById(subunit.getId()).orElseThrow();

        subFromRepo.setCity(subunit.getCity());
        subFromRepo.setCountry(subunit.getCountry());
        subFromRepo.setPostcode(subunit.getPostcode());
        subFromRepo.setStreet(subunit.getStreet());

        return subFromRepo;
    }
    public void deleteSubunit(long id)
    {
        subunitRepository.deleteById(id);
    }
}
