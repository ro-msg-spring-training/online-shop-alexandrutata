package ro.msg.learning.shop.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product extends BaseModel {
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
    private Category category;

    @JoinColumn(name = "supplier_id")
    @ManyToOne()
    private Supplier supplier;

    @Column(name = "image_url")
    private String imageUrl;
}
