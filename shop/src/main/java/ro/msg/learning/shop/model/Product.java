package ro.msg.learning.shop.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Data
@SuperBuilder
@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
@EqualsAndHashCode(callSuper = true)
@Table(name = "product")
public class Product extends BaseEntity{
    @Column(name="name", unique = true, nullable = false)
    private String name;

    @Column(name="description", unique = true, nullable = false)
    private String description;

    @Column(name="price", unique = true, nullable = false)
    private BigDecimal price;

    @Column(name="weight", unique = true, nullable = false)
    private Double weight;

    @Column(name="imageURL", unique = true, nullable = false)
    private String imageURL;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = ProductCategory.class)
    @JoinColumn(name = "product_category_id", referencedColumnName = "id")
    private ProductCategory category;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Supplier.class)
    @JoinColumn(name = "supplier_id", referencedColumnName = "id")
    private Supplier supplier;
}