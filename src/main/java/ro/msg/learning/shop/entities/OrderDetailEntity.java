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
@Table(name = "order_detail")
public class OrderDetailEntity extends BaseEntity {
    @JoinColumn(name = "order_id")
    @ManyToOne()
    private OrderEntity order;

    @JoinColumn(name = "product_id")
    @ManyToOne()
    private ProductEntity product;

    @Column(name = "quantity")
    private int quantity;
}
