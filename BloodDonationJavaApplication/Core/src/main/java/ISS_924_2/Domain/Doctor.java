package iss_924_2.domain;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Doctor extends User {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doctor", fetch = FetchType.EAGER)
    Set<Analysis> analysis = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doctor", fetch = FetchType.EAGER)
    Set<Request> request = new HashSet<>();

    @ManyToOne(fetch = FetchType.EAGER)
    private Hospital hospital;
}