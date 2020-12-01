package WUT.dbWoodenProject.service;

import WUT.dbWoodenProject.controller.dto.ItemDto;
import WUT.dbWoodenProject.model.Item;
import WUT.dbWoodenProject.repository.ItemRepository;
import WUT.dbWoodenProject.repository.OrderItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemService {

        private final ItemRepository itemRepository;
        private final OrderItemRepository orderItemRepository;

        public List<Item> findAllItems()
        {
            return itemRepository.findAll();
        }

        public Item findById(Long id)
        {
            return itemRepository.findById(id)
                    .orElseThrow();
        }

    public Item addItem(ItemDto itemDto) {
        Item item = new Item();
        item.setDescription(itemDto.getDescription());
        item.setName(itemDto.getName());
        item.setNumberInStock(itemDto.getNumberInStock());
        item.setPrice(itemDto.getPrice());

        return itemRepository.save(item);
    }

    @Transactional
    public Item updateItem(Item item) {
            Item itemFromRepo = itemRepository.findById(item.getId()).orElseThrow();
            itemFromRepo.setPrice(item.getPrice());
            itemFromRepo.setNumberInStock(item.getNumberInStock());
            itemFromRepo.setName(item.getName());
            itemFromRepo.setDescription(item.getDescription());

            return itemFromRepo;
    }

    public boolean deleteItem(Long id)
    {
        if(orderItemRepository.findAllByOrderId(id).size() != 0)
        {
            //cant delete this if this exists in ordersItems => sorry m8
            return false;
        }else{
            this.itemRepository.deleteById(id);
            return true;
        }

    }
}
