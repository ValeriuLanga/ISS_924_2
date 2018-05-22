package iss_924_2.repository;

<<<<<<< HEAD
import iss_924_2.domain.Identifier;
=======
import iss_924_2.Domain.Identifier;
>>>>>>> 2f2893de3982d852dce811ed34ddac99029b3255
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

/**
 * Created by radu.
 */
@NoRepositoryBean
@Transactional
public interface Repository<T extends Identifier<ID>, ID extends Serializable>
        extends JpaRepository<T, ID> {


}
