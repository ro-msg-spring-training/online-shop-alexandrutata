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
@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
@EqualsAndHashCode(callSuper = true)
@Table(name = "location")
public class Location extends BaseEntity{
    @Column(name="name", unique = true, nullable = false)
    private String name;

    @Column(name="address_country", unique = true, nullable = false)
    private String addressCountry;

    @Column(name="address_city", unique = true, nullable = false)
    private String addressCity;

    @Column(name="address_county", unique = true, nullable = false)
    private String addressCounty;

    @Column(name="address_street", unique = true, nullable = false)
    private String addressStreet;
}