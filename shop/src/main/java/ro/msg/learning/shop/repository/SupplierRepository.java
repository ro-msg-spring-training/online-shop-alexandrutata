package ro.msg.learning.shop.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ro.msg.learning.shop.model.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
    public boolean existsByName(String name);
    public Supplier findByName(String name);
    public List<Supplier> findAllByOrderByIdDesc(Pageable pageable);
}
