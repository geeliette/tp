package seedu.address.model.reservation;

import static java.util.Objects.requireNonNull;

/**
 * Represents a Person's remark in the address book.
 * Guarantees: immutable; is always valid
 */
public class Remark {
    public static final String VALIDATION_REGEX = "[\\p{Alnum}\\s]{0,30}";
    public static final String MESSAGE_CONSTRAINTS = "Remark must be of alphanumeric only and "
            + "length must be at least 1 and at most 30";
    public final String value;

    /**
     * Constructs a {@code Remark} object with the specified remark text.
     *
     * @param remark The remark text. Must not be null.
     */
    public Remark(String remark) {
        requireNonNull(remark);
        value = remark;
    }

    /**
     * Returns true if a given string is a valid remark.
     */
    public static boolean isValidRemark(String test) {
        return test.matches(VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Remark // instanceof handles nulls
                && value.equals(((Remark) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
