package ro.msg.learning.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import ro.msg.learning.shop.model.Supplier;

@Repository
@Component
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
    //Supplier findByName(String name);

    //Supplier getById(Integer id);
}
