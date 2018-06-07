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

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private Doctor doctor;

    @Enumerated(EnumType.STRING)
    private RequestStatus status = RequestStatus.registered;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private BloodContainer bloodContainer;

    private int quantity;

    public void cancelRequest() {
        status = RequestStatus.cancelled;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (bloodContainer != null) {
            sb.append("Blood type: ");
            sb.append(bloodContainer.getBloodType());
            sb.append(", ");
            sb.append("Container type: ");
            sb.append(bloodContainer.getContainerType());
            sb.append(", ");
        }
        sb.append("Urgency level: ");
        sb.append(urgencyLevel);
        sb.append(", ");
        sb.append("Quantity: ");
        sb.append(quantity);
        sb.append(", ");
        sb.append("STATUS: ");
        sb.append(status);

        return sb.toString();
    }
}