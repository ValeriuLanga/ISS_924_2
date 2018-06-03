package iss_924_2.domain;

import lombok.*;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Data
public class Patient extends BaseEntity<Integer> {

    @OneToOne(fetch = FetchType.EAGER)
    private Blood blood;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Hospital hospital;
}