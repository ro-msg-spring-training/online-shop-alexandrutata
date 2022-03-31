package ro.msg.learning.shop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ro.msg.learning.shop.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>  {

    public Customer findByEmailAndFirstName(String email, String firstName);
    public List<Customer> findByEmail(String email);
}
