package WUT.dbWoodenProject.controller;

import WUT.dbWoodenProject.controller.dto.ItemDto;
import WUT.dbWoodenProject.model.Item;
import WUT.dbWoodenProject.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/items")
    public Item addItem(@RequestBody ItemDto itemDto)
    {
        return itemService.addItem(itemDto);
    }

    @PutMapping("/items")
    public Item updateItem( @RequestBody Item item)
    {
        return itemService.updateItem(item);
    }

    @DeleteMapping("/items/{id}")
    public boolean deleteItem(@PathVariable Long id)
    {
        return itemService.deleteItem(id);
    }

}
