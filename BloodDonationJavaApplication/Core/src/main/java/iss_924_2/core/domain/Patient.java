package iss_924_2.core.domain;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class Patient extends BaseEntity<Integer> {

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Blood blood;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Hospital hospital;

}