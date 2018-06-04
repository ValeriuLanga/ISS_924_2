package iss_924_2.domain;

import lombok.*;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Data
public class Analysis extends BaseEntity<Integer> {

    @ManyToOne(fetch = FetchType.EAGER)
    private Doctor doctor;

    private boolean validity;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Donation donation;

}