package iss_924_2.domain;

import iss_924_2.utils.Status;
import lombok.*;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Data
public class Donation extends BaseEntity<Integer> {

    private int quantity;

    private String expirationDate;

    private String donationDate;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne(fetch = FetchType.EAGER)
    private Blood blood;

    @ManyToOne(fetch = FetchType.EAGER)
    private Donor donor;

}