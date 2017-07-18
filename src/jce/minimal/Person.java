package jce.minimal;

/**
 * This is a class for testing purposes of the Java code ecorification.
 */
public class Person {
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

    /**
     * This main method should work in the ecorified code.
     */
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Doe");
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getFullName());
    }

}
