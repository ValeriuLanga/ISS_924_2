package iss_924_2.domain;

import lombok.*;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Entity
@Data
public class Administrator extends User {

}