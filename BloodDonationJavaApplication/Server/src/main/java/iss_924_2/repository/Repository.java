package iss_924_2.repository;

import iss_924_2.domain.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

/**
 * Created by radu.
 */
@NoRepositoryBean
@Transactional
public interface Repository<T extends BaseEntity<ID>, ID extends Serializable>
        extends JpaRepository<T, ID> {


}
