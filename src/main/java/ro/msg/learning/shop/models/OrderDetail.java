package ro.msg.learning.shop.models;

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
public class OrderDetail extends BaseModel {
    @JoinColumn(name = "order_id")
    @ManyToOne()
    private Order order;

    @JoinColumn(name = "product_id")
    @ManyToOne()
    private Product product;

    @Column(name = "quantity")
    private int quantity;
}
