package ISS_924_2.Repository;
import java.util.Optional;

public interface IRepository<ID extends Integer, T extends BaseEntity<ID>> {
    /**
     * Find the entity with the given {@code id}.
     *
     * @param id must be not null.
     * @return an {@code Optional} encapsulating the entity with the given id.
     */
    Optional<T> findOne(ID id);

    /**
     * @return all entities.
     */
    Iterable<T> findAll();

    /**
     * Saves the given entity.
     *
     * @param entity must not be null.
     * @return an {@code Optional} - null if the entity was saved otherwise (e.g. id already exists) returns the entity.
     * @throws ValidatorException if the entity is not valid.
     */
    Optional<T> save(T entity) throws ValidatorException;

    /**
     * Removes the entity with the given id.
     *
     * @param id must not be null.
     * @return an {@code Optional} - null if there is no entity with the given id, otherwise the removed entity.
     */
    Optional<T> delete(ID id);

    /**
     * Updates the given entity.
     *
     * @param entity must not be null.
     * @return an {@code Optional} - null if the entity was updated otherwise (e.g. id does not exist) returns the
     *         entity.
     * @throws ValidatorException if the entity is not valid.
     */
    Optional<T> update(T entity) throws ValidatorException;
}
