package iss_924_2.core.domain;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Patient extends BaseEntity<Integer> {

    private String name;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private Blood blood;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private Hospital hospital;

}