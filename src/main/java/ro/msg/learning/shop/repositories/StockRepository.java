package ro.msg.learning.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.msg.learning.shop.entities.StockEntity;

import java.util.List;

@Repository
public interface StockRepository extends JpaRepository<StockEntity, Integer> {

    List<StockEntity> findAllByLocationId(int locationId);
}
