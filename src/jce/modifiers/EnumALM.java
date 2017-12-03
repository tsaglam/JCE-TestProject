package jce.modifiers;

/**
 * This is a enum for testing purposes of the Java code ecorification.
 */
public enum EnumALM {
    AA, BB, CC;
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
