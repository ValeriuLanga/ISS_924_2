package iss_924_2.core.domain;

import iss_924_2.core.utils.UserType;
import lombok.*;

import javax.persistence.*;

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

    @Enumerated(EnumType.STRING)
    protected UserType userType;
}