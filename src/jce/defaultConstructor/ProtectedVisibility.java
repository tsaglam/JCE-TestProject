package jce.defaultConstructor;

/**
 * This is a class for testing purposes of the Ecore metamodel extraction.
 */
public class ProtectedVisibility {
    private String message;

    protected ProtectedVisibility() {
        setMessage("SOMETHING");
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}