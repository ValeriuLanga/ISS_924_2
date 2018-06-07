package iss_924_2.core.domain;

import iss_924_2.core.utils.ContainerType;
import iss_924_2.core.utils.Status;
import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class BloodContainer extends BaseEntity<Integer> {

    // Expiration date
    private String shelfLife;

    @Enumerated(EnumType.STRING)
    private ContainerType containerType;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Hospital hospital;

}