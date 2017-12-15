package jce.defaultConstructor;

/**
 * This is a class for testing purposes of the Ecore metamodel extraction.
 */
public class PrivateVisibility {
    private String message;

    private PrivateVisibility() {
        setMessage("SOMETHING");
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}