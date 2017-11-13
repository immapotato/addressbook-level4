package seedu.address.model.person;

import static java.util.Objects.requireNonNull;

import java.io.File;

import seedu.address.commons.exceptions.IllegalValueException;

//@@author pohjie
/**
 * Represents a Person's profile picture in the address book.
 * Hardcoded now till further versions support image uploading
 */
public class ProfilePicture {

    public final String profilePicPath;

    /**
     * Default constructor
     * All Person will get this default image in V1.4 and V1.5
     */
    public ProfilePicture() {
        profilePicPath = "/images/defaultProfilePic.png";
    }

    /**
     * User can choose to add in profile pictures hosted on personal file hosting service.
     * @param path
     * @throws IllegalValueException
     */
    public ProfilePicture(String path) throws NullPointerException {
        requireNonNull(path);
        profilePicPath = path;
    }

    public boolean isValidPath(String path) {
        File file = new File(path);
        if (file.exists()) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return profilePicPath;
    }

    @Override
    public boolean equals(Object other) {
        return other == this
                || (other instanceof ProfilePicture
                && this.profilePicPath.equals(((ProfilePicture) other).profilePicPath));
    }

    @Override
    public int hashCode() {
        return profilePicPath.hashCode();
    }
}
