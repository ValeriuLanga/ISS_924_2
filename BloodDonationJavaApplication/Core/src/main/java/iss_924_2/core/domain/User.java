package iss_924_2.core.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users")
@Data
public class User extends BaseEntity<Integer> {

    @Column(unique = true)
    protected String userName;

    protected String password;

    protected String firstName;

    protected String lastName;
}