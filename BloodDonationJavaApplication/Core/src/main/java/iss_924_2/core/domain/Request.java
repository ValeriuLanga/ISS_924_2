package iss_924_2.core.domain;

import iss_924_2.core.utils.ContainerType;
import iss_924_2.core.utils.RequestStatus;
import lombok.*;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Request extends BaseEntity<Integer> {

    private int urgencyLevel;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Doctor doctor;

    @Enumerated(EnumType.STRING)
    @Builder.Default
    private RequestStatus status = RequestStatus.registered;

    @Enumerated(EnumType.STRING)
    private ContainerType containerType;

    private int quantity;

    public void cancelRequest() {
        status = RequestStatus.cancelled;
    }

}