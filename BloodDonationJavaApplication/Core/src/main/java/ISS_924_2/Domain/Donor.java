package iss_924_2.domain;

import lombok.*;

import javax.persistence.*;
import java.util.*;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Donor extends User {

    private Date dateOfBirth;

    @OneToOne(fetch = FetchType.EAGER)
    private Address address;

    @OneToOne(fetch = FetchType.EAGER)
    private Address actualAddress;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "donor", fetch = FetchType.EAGER)
    private Set<Donation> donation = new HashSet<>();
}