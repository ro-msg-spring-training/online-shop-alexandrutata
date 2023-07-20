package ro.msg.learning.shop.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@Entity
@Table(name = "product")
public class ProductEntity extends BaseEntity {
    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "weight")
    private double weight;

    @JoinColumn(name = "category_id")
    @ManyToOne()
    private CategoryEntity category;

    @JoinColumn(name = "supplier_id")
    @ManyToOne()
    private SupplierEntity supplier;

    @Column(name = "image_url")
    private String imageUrl;
}
