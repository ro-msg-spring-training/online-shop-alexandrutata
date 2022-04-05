package ro.msg.learning.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import ro.msg.learning.shop.model.Supplier;
import ro.msg.learning.shop.properties.SupplierProperties;
import ro.msg.learning.shop.repository.SupplierRepository;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    @Autowired
    private SupplierProperties supplierProperties;

    public List<Supplier> getSuppliers() {

        var supplier = Supplier.builder().name("s5").build();
        supplier = supplierRepository.save(supplier);

        Pageable pageable = PageRequest.of(0, supplierProperties.getPageSize());
        return supplierRepository.findAllByOrderByIdDesc(pageable);
    }
}
