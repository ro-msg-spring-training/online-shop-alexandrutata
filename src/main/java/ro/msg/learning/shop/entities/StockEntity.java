package ro.msg.learning.shop.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@Entity
@Table(name = "stock")
public class StockEntity extends BaseEntity {
    @JoinColumn(name = "product_id")
    @ManyToOne(cascade = CascadeType.REMOVE)
    private ProductEntity product;

    @JoinColumn(name = "location_id")
    @ManyToOne()
    private LocationEntity location;

    @Column(name = "quantity")
    private int quantity;
}
