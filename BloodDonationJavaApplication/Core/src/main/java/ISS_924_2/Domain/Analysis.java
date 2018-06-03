package iss_924_2.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Data
public class Analysis extends BaseEntity<Integer> {

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Doctor doctor;

    private boolean validity;

    @OneToOne(fetch = FetchType.EAGER)
    private BloodDonation bloodDonation;
}