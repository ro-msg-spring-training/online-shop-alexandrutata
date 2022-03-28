package ro.msg.learning.shop.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Data
@SuperBuilder
@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
@EqualsAndHashCode(callSuper = true)
@Table(name = "revenue")
public class Revenue extends BaseEntity{
    @Column(name="date", unique = true, nullable = false)
    private LocalDate date;

    @Column(name="sum", unique = true, nullable = false)
    private BigDecimal sum;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Location.class)
    @JoinColumn(name = "location_id", referencedColumnName = "id")
    private Location location;
}