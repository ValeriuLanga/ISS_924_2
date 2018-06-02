package iss_924_2.domain;

import iss_924_2.utils.BloodType;
import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Data
public class Blood extends BaseEntity<Integer> {

    private BloodType bloodType;

    private boolean isRhPositive;
}