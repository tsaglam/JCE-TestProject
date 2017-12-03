package jce.modifiers;

/**
 * This is a class for testing purposes of the Java code ecorification.
 */
public class ClassALM { // TODO (HIGH) Ecorify project and check classes from EME-TestProject.
    static int staticAttribute;
    int defaultAttribute;
    @SuppressWarnings("unused")
    private int privateAttribute;
    protected int protectedAttribute;
    public int publicAttribute;

    public static void staticMethod() {
    }

    void defaultMethod() {
    }

    @SuppressWarnings("unused")
    private void privateMethod() {
    }

    protected void protectedMethod() {
    }

    public void publicMethod() {
    }
}
