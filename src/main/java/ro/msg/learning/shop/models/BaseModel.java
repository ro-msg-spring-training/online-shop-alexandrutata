package ro.msg.learning.shop.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@MappedSuperclass
public class BaseModel {
    @Id
    @Column(name = "id")
    private int id;
}
