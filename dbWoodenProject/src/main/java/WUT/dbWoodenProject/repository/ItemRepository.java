package WUT.dbWoodenProject.repository;

import WUT.dbWoodenProject.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

    @Query("SELECT item from Item item")
    List<Item> findAll();

}
