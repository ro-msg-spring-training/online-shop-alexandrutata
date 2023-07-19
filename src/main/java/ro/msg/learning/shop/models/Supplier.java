package ro.msg.learning.shop.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@Entity
@Table(name = "supplier")
public class Supplier extends BaseModel {

    @Column(name = "name")
    private String name;
}
