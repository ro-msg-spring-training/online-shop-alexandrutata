package ro.msg.learning.shop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "supplier")
public class Supplier extends BaseEntity {
    @Column(name="name", unique = true, nullable = false)
    private String name;
}