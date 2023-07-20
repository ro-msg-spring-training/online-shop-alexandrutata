package ro.msg.learning.shop.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@Entity
@Table(name = "revenue")
public class RevenueEntity extends BaseEntity {
    @JoinColumn(name = "location_id")
    @ManyToOne()
    private LocationEntity location;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "sum")
    private BigDecimal sum;
}
