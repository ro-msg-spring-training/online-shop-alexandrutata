package ro.msg.learning.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.msg.learning.shop.models.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {
}
