package jce.simple;

/**
 * This is a class for testing purposes of the Java code ecorification.
 */
public class Person { // TODO (HIGH) remove?
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
