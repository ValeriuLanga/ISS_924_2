package iss_924_2.domain;

import iss_924_2.utils.ContainerType;
import iss_924_2.utils.RequestStatus;
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
public class Request extends BaseEntity<Integer> {

    private int urgencyLevel;

    @ManyToOne(fetch = FetchType.EAGER)
    private Doctor doctor;

    private RequestStatus status = RequestStatus.registered;

    private ContainerType containerType;

    private int quantity;
}