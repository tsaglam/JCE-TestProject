package jce.constructors;

import java.util.List;

import java.awt.BasicStroke;

/**
 * This is a class for testing purposes of the Java code ecorification.
 */
public class SubClass extends SuperClass {

    public SubClass() {
        super();
        System.out.println("Sub: No parameters!");
    }

    public SubClass(int number) {
        super(number);
        System.out.println("Sub: " + number);
    }

    public SubClass(int number, BasicStroke stroke) {
        super(number, stroke);
    }

    public SubClass(int number, String text, Object[] array) {
        super(number, text, array);
    }

    public SubClass(List<String> list) {
        super(list);
    }

    public static void main(String[] args) {
        new SubClass();
        new SubClass(0);
    }
}
