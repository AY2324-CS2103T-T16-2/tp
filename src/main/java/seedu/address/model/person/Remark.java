package seedu.address.model.person;

import java.util.Objects;

/**
 * Represents a Remark in the address book.
 */
public class Remark {
    private final String remark;
    public Remark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Remark)) {
            return false;
        }
        Remark otherRemark = (Remark) other;
        return Objects.equals(remark, otherRemark.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(remark);
    }

    @Override
    public String toString() {
        return remark;
    }
}
