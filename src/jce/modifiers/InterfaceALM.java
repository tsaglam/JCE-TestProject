package jce.modifiers;

/**
 * This is a interface for testing purposes of the Ecore metamodel extraction.
 */
public interface InterfaceALM {
    int defaultAttribute = 0;
    public int publicAttribute = 1;
    static int staticAttribute = 2;

    public abstract void abstractMethod();

    void defaultMethod();

    public void publicMethod();
}
