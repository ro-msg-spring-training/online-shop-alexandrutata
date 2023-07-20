package ro.msg.learning.shop.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class OrderEntity extends BaseEntity {
    @JoinColumn(name = "shipped_from_id")
    @ManyToOne()
    private LocationEntity location;

    @JoinColumn(name = "customer_id")
    @ManyToOne()
    private CustomerEntity customer;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "country")
    private String country;

    @Column(name = "city")
    private String city;

    @Column(name = "street")
    private String street;
}
