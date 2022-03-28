package ro.msg.learning.shop.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@MappedSuperclass
@Getter @Setter
@SuperBuilder
@NoArgsConstructor
public class BaseEntity {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
}