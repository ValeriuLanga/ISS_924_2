package iss_924_2.core.domain;

import lombok.*;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Data
public class Analysis extends BaseEntity<Integer> {

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Doctor doctor;

    private boolean validity;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Donation donation;

}