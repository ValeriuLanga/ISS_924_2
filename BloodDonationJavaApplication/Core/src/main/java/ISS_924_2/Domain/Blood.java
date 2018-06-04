package iss_924_2.domain;

import iss_924_2.utils.BloodType;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Data
public class Blood extends BaseEntity<Integer> {

    @Enumerated(EnumType.STRING)
    private BloodType bloodType;

    private boolean isRhPositive;

    @OneToMany(mappedBy = "blood", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    @Builder.Default
    private Set<Donation> donation = new HashSet<>();

    @OneToMany(mappedBy = "blood", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    @Builder.Default
    private Set<Patient> patients = new HashSet<>();

}