package ro.msg.learning.shop.dto;

import java.math.BigDecimal;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import ro.msg.learning.shop.model.Product;
import ro.msg.learning.shop.model.ProductCategory;
import ro.msg.learning.shop.model.Supplier;

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

    public Product getProduct(ProductCategory category, Supplier supplier) {
        return Product.builder().name(name)
                .description(description).price(price).weight(weight).imageURL(imageURL).supplier(supplier).category(category).build();
    }
}
