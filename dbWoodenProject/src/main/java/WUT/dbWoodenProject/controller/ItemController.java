package WUT.dbWoodenProject.controller;

import WUT.dbWoodenProject.model.Item;
import WUT.dbWoodenProject.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @GetMapping("/items")
    public List<Item> getAllItems()
    {
        return itemService.findAllItems();
    }

    @GetMapping("/items/{id}")
    public Item findItemById(@PathVariable Long id)
    {
        return itemService.findById(id);
    }


}
