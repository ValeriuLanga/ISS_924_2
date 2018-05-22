package iss_924_2.Domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Created by radu.
 */
@MappedSuperclass
public class Identifier<ID> implements Serializable {

    @Id
    @GeneratedValue
    @Column(unique = true,nullable = false)
    private ID id;

    public Identifier() {
    }

    public Identifier(ID id) {
        this.id = id;
    }

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Identifier{" +
                "id=" + id +
                '}';
    }
}
