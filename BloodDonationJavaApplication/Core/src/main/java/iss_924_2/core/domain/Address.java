package iss_924_2.core.domain;

import lombok.*;
import javax.persistence.Entity;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Address extends BaseEntity<Integer> {

    private String street;

    private String number;

    private String city;

    private String country;

}
