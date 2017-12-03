package jce.modifiers;

/**
 * This is a interface for testing purposes of the Java code ecorification.
 */
public interface InterfaceALM {
    int defaultAttribute = 0;
    public int publicAttribute = 1;
    static int staticAttribute = 2;

    public abstract void abstractMethod();

    void defaultMethod();

    public void publicMethod();
}
