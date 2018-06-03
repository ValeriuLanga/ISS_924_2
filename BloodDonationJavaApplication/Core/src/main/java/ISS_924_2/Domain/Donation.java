package iss_924_2.domain;

import lombok.*;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Data
public class Donation extends BaseEntity<Integer> {

    @OneToOne(fetch = FetchType.EAGER)
    private BloodDonation bloodDonation;

    @ManyToOne(fetch = FetchType.EAGER)
    private Donor donor;
}