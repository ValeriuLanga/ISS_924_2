package iss_924_2.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Data
public class User extends BaseEntity<Integer> {

    protected Integer userType;
    @Column(unique = true)
    protected String userName;

    protected String password;

    protected String firstName;

    protected String lastName;
}