package ro.msg.learning.shop.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@Entity
@Table(name = "stock")
public class Stock extends BaseModel {
    @JoinColumn(name = "product_id")
    @ManyToOne()
    private Product product;

    @JoinColumn(name = "location_id")
    @ManyToOne()
    private Location location;

    @Column(name = "quantity")
    private int quantity;
}
