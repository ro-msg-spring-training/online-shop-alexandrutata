package ro.msg.learning.shop.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties(prefix = "suppliers")
@Data
public class SupplierProperties {
    private int pageSize = 2;
}
