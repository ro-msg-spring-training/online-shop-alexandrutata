package ro.msg.learning.shop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "product_category")
public class ProductCategory extends BaseEntity{
    @Column(name="name", unique = true, nullable = false)
    private String name;

    @Column(name="description", unique = true, nullable = false)
    private String description;
}