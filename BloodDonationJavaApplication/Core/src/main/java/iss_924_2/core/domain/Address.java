package iss_924_2.core.domain;

import lombok.*;
import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Data
public class Address extends BaseEntity<Integer> {

    private String street;

    private String number;

    private String city;

    private String country;

}
