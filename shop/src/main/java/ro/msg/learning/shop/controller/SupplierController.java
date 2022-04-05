package ro.msg.learning.shop.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ro.msg.learning.shop.model.Supplier;
import ro.msg.learning.shop.service.SupplierService;

@RestController
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @GetMapping("/test")
    public String get(Principal principal){
        return "***" + (principal == null ? "NULL" : principal.getName()) + "***";
    }

    @GetMapping("/suppliers")
    public List<Supplier> getSuppliers() {
        return supplierService.getSuppliers();
    }
}
