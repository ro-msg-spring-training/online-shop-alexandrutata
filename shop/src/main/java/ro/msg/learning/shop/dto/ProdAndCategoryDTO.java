package ro.msg.learning.shop.dto;

import java.math.BigDecimal;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ProdAndCategoryDTO extends BaseDTO{
    private String name;
    private String description;
    private BigDecimal price;
    private Double weight;
    private String imageURL;
    private String categoryName;
    private String categoryDesc;
    private String supplierName;
}
