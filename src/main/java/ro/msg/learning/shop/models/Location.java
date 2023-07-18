package ro.msg.learning.shop.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@Entity
@Table(name = "location")
public class Location extends BaseModel {
    @Column(name = "name")
    private String name;

    @Column(name = "country")
    private String country;

    @Column(name = "city")
    private String city;

    @Column(name = "street")
    private String street;
}
