package jce.modifiers;

/**
 * This is a class for testing purposes of the Java code ecorification.
 */
public class DefaultClassClient {
    private DefaultClass defaultClass;

    public DefaultClass getDefaultClass() {
        return defaultClass;
    }

    public void setDefaultClass(DefaultClass defaultClass) {
        this.defaultClass = defaultClass;
    }

    public void someMethod() {
        System.out.println(defaultClass + " " + DefaultClass.class);
    }

}
