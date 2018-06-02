package iss_924_2.domain;

import javax.persistence.*;
import java.util.*;

/**
 * 
 */
@Entity
public class Hospital extends BaseEntity<Integer> {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hospital", fetch = FetchType.EAGER)
    private Set<Hospital> hospitals = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hospital", fetch = FetchType.EAGER)
    private Set<Patient> patients = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hospital", fetch = FetchType.EAGER)
    private Set<BloodContainer> bloodContainers = new HashSet<>();

    @OneToOne(fetch = FetchType.EAGER)
    private Address address;

    private String name;
}