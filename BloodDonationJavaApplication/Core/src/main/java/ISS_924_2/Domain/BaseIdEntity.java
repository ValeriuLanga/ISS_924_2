package ISS_924_2.Domain;

import java.io.Serializable;

public class BaseIdEntity <ID extends Integer> implements Serializable {
    private ID id;

    /**
     * Constructor
     *
     * @param id The ID of the current object
     */
    public BaseIdEntity(ID id) {
        this.id = id;
    }
    /**
     * Getter for the ID of the current BaseEntity instance
     *
     * @return The ID of the current BaseEntity instance
     */
    public ID getId() { return id; }

    /**
     * Setter for the ID of the current BaseEntity instance
     *
     * @param id The new ID for the current BaseEntity instance
     */
    public void setId(ID id) { this.id = id; }

    /**
     * Gets an empty string representing the current BaseEntity instance in CSV format
     *
     * @return An empty string
     */
    public String CSV() { return ""; }

    /**
     * Overrides the toString method for the current BaseEntity instance
     *
     * @return A string representing the current BaseEntity instance
     */
    @Override
    public String toString() {
        return "BaseEntity{" + "id=" + id + '}';
    }

    /**
     * Returns an empty string representing the serialization of the current BaseEntity instance
     *
     * @return An empty string
     */
//    public String Serialize() {
//        return "";
//    }
}