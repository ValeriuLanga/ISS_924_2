package iss_924_2.domain;

import lombok.*;

import javax.persistence.*;
import java.util.*;

/**
 * 
 */
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Hospital extends BaseEntity<Integer> {

    private String name;

    @OneToMany(mappedBy = "hospital", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    @Builder.Default
    private Set<Doctor> doctors = new HashSet<>();

    @OneToMany(mappedBy = "hospital", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    @Builder.Default
    private Set<Patient> patients = new HashSet<>();

    @OneToMany(mappedBy = "hospital", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    @Builder.Default
    private Set<BloodContainer> bloodContainers = new HashSet<>();

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Address address;

}