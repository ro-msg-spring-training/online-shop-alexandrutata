package ro.msg.learning.shop.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@Entity
@Table(name = "revenue")
public class Revenue extends BaseModel {
    @JoinColumn(name = "location_id")
    @ManyToOne()
    private Location location;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "sum")
    private BigDecimal sum;
}
