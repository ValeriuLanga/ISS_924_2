package iss_924_2.domain;

import iss_924_2.utils.ContainerType;
import iss_924_2.utils.Status;
import lombok.*;

import javax.persistence.Entity;
import java.util.*;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Data
public class BloodContainer extends BaseEntity<Integer> {

    private Date shelfLife;

    private ContainerType containerType;

    private Status status;
}