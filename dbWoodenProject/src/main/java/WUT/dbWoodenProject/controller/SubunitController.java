package WUT.dbWoodenProject.controller;


import WUT.dbWoodenProject.controller.dto.SubunitDto;
import WUT.dbWoodenProject.model.Subunit;
import WUT.dbWoodenProject.service.SubunitService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SubunitController {

    private final SubunitService subunitService;

    //public List<Subunit> getSubunits

    @GetMapping("/subunit")
    public List<SubunitDto> getSubunits(@RequestParam(required = false) Integer page, Sort.Direction sort)
    {
        int pageNumber = page != null && page >= 0 ? page : 0;
        Sort.Direction sortDirection = sort != null ? sort : Sort.Direction.ASC;

        return DtoMapper.mapToSubunitDto(subunitService.getSubunits(pageNumber, sortDirection));
    }

    @GetMapping("/subunit/order")
    public List<Subunit> getSubunitsWithShipments(@RequestParam(required = false) Integer page, Sort.Direction sort)
    {
        int pageNumber = page != null && page >= 0 ? page : 0;
        Sort.Direction sortDirection = sort != null ? sort : Sort.Direction.ASC;

        return subunitService.getSubunitsWithShipments(pageNumber, sortDirection);
    }

    @GetMapping("/subunit/{id}")
    public Subunit getSubunit(@PathVariable long id)
    {
        return subunitService.getSubunitById(id);
    }

    @PostMapping("/subunit")
    public Subunit addSubunit(@RequestBody Subunit subunit)
    {
        return subunitService.addSubunit(subunit);
    }

    @PutMapping("/subunit")
    public Subunit updateSubunit(@RequestBody Subunit subunit)
    {
        return subunitService.updateSubunit(subunit);
    }

    @DeleteMapping("/subunit/{id}")
    public void deleteSubunit(@PathVariable long id)
    {
        subunitService.deleteSubunit(id);
    }


}
