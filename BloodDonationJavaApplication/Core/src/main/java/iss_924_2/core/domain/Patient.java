package iss_924_2.core.domain;

import lombok.*;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Data
public class Patient extends BaseEntity<Integer> {

    @ManyToOne(fetch = FetchType.EAGER)
    private Blood blood;

    @ManyToOne(fetch = FetchType.EAGER)
    private Hospital hospital;

}