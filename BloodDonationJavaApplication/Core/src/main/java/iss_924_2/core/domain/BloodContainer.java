package iss_924_2.core.domain;

import iss_924_2.core.utils.BloodType;
import iss_924_2.core.utils.ContainerType;
import iss_924_2.core.utils.Status;
import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class BloodContainer extends BaseEntity<Integer> {

    // Expiration date
    private String shelfLife;

    @Enumerated(EnumType.STRING)
    private BloodType bloodType;

    @Enumerated(EnumType.STRING)
    private ContainerType containerType;

    @Enumerated(EnumType.STRING)
    private Status status = Status.preparation;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private Hospital hospital;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Blood type: ");
        sb.append(bloodType);
        sb.append(", Container type: ");
        sb.append(containerType);
        sb.append(", Status: ");
        sb.append(status);

        return sb.toString();
    }
}