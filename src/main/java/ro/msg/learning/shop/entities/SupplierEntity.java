package ro.msg.learning.shop.entities;

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
public class SupplierEntity extends BaseEntity {

    @Column(name = "name")
    private String name;
}
