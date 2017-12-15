package jce.defaultConstructor;

/**
 * This is a class for testing purposes of the Ecore metamodel extraction.
 */
public class NoConstructor {
    private String message;

    public NoConstructor(String message) {
        setMessage(message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}