package iss_924_2.core.domain;

import lombok.*;

import javax.persistence.*;
import java.util.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Donor extends User {

    private String dateOfBirth;

    private String phoneNumber;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Address address;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Address actualAddress;

    @OneToMany(mappedBy = "donor", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    private Set<Donation> donation = new HashSet<>();

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Patient patient;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: " + super.getFirstName() + " " + super.getLastName());
        sb.append(", Date of birth: " + this.getDateOfBirth());
        sb.append(", Phone number: " + this.getPhoneNumber());
        return sb.toString();
    }
}