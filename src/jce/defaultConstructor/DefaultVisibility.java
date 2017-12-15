package jce.defaultConstructor;

/**
 * This is a class for testing purposes of the Ecore metamodel extraction.
 */
public class DefaultVisibility {
    private String message;

    DefaultVisibility() {
        setMessage("SOMETHING");
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}