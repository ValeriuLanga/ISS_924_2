package iss_924_2.core.domain;

import iss_924_2.core.utils.ContainerType;
import iss_924_2.core.utils.RequestStatus;
import lombok.*;

import javax.persistence.*;

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

    @Enumerated(EnumType.STRING)
    @Builder.Default
    private RequestStatus status = RequestStatus.registered;

    @Enumerated(EnumType.STRING)
    private ContainerType containerType;

    private int quantity;

}