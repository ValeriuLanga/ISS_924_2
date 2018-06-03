package iss_924_2.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import java.util.*;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Data
public class BloodDonation extends BaseEntity<Integer> {

    private int quantity;

    private Date expirationDate;

    @OneToOne(fetch = FetchType.EAGER)
    private Blood blood;
}