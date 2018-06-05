package iss_924_2.domain;

import iss_924_2.utils.ContainerType;
import iss_924_2.utils.Status;
import lombok.*;

import javax.persistence.*;
import java.util.*;

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