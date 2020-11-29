package WUT.dbWoodenProject.service;

import WUT.dbWoodenProject.model.Item;
import WUT.dbWoodenProject.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemService {

        private final ItemRepository itemRepository;


        public List<Item> findAllItems()
        {
            return itemRepository.findAll();
        }

        public Item findById(Long id)
        {
            return itemRepository.findById(id)
                    .orElseThrow();
        }

}
