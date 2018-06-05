package iss_924_2.core.domain;

import iss_924_2.core.utils.ContainerType;
import iss_924_2.core.utils.Status;
import lombok.*;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Data
public class BloodContainer extends BaseEntity<Integer> {

    // Expiration date
    private String shelfLife;

    @Enumerated(EnumType.STRING)
    private ContainerType containerType;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne(fetch = FetchType.EAGER)
    private Hospital hospital;

}