package iss_924_2.core.domain;

import iss_924_2.core.utils.Status;
import lombok.*;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = false)
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

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Blood blood;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Donor donor;

}