package ro.msg.learning.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.msg.learning.shop.models.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    Category findByName(String name);
}
