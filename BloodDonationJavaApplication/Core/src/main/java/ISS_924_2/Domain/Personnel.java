package iss_924_2.domain;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Entity
@Data
public class Personnel extends User {

}