package ro.msg.learning.shop.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@MappedSuperclass
public class BaseEntity {
    @Id
    @Column(name = "id")
    private int id;
}
