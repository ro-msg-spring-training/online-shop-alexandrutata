package ro.msg.learning.shop;

import org.springframework.beans.factory.annotation.Autowired;

import ro.msg.learning.shop.model.Supplier;
import ro.msg.learning.shop.repository.SupplierRepository;

public class TestRepository{
	
    @Autowired
    private SupplierRepository supplierRepository;

    public void test(){
        var supplier = Supplier.builder()
            .id(24)
            .name("my first supplier")
            .build();

        supplierRepository.save(supplier);

        var supplier2 = supplierRepository.getById(24);
        int id = supplier2.getId();
        var name = supplier2.getName();
    }
}