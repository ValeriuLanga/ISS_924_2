package iss_924_2.core.domain;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Doctor extends User {

    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    private Set<Analysis> analysis = new HashSet<>();

    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    private Set<Request> request = new HashSet<>();

    @ManyToOne(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
    private Hospital hospital;

    @Override
    public String toString() {
        return "Doctor name: " + super.getFirstName();
    }
}