package ro.msg.learning.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import lombok.Setter;
import ro.msg.learning.shop.model.Supplier;
import ro.msg.learning.shop.repository.SupplierRepository;

@Service
@ConfigurationProperties(prefix = "suppliers")
public class SupplierService {
    @Setter
    private int pageSize = 2;

    @Autowired
    private SupplierRepository supplierRepository;

    public List<Supplier> getSuppliers() {
        Pageable pageable = PageRequest.of(0, pageSize);
        return supplierRepository.findAllByOrderByIdDesc(pageable);
    }
}
