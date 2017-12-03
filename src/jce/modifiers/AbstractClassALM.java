package jce.modifiers;

/**
 * This is a class for testing purposes of the Java code ecorification.
 */
public abstract class AbstractClassALM {
    static int staticAttribute;
    int defaultAttribute;
    @SuppressWarnings("unused")
    private int privateAttribute;
    protected int protectedAttribute;
    public int publicAttribute;

    public static void staticMethod() {
    }

    public AbstractClassALM() {
    }

    public AbstractClassALM(int intParam) {
    }

    public abstract void abstractMethod();

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