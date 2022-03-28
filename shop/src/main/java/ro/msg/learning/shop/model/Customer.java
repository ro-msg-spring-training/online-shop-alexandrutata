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
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "customer")
public class Customer extends BaseEntity{
    @Column(name="first_name", unique = true, nullable = false)
    private String firstName;

    @Column(name="last_name", unique = true, nullable = false)
    private String lastName;

    @Column(name="username", unique = true, nullable = false)
    private String username;

    @Column(name="password", unique = true, nullable = false)
    private String password;

    @Column(name="email", unique = true, nullable = false)
    private String email;
}