package jce.constructors;

import java.awt.BasicStroke;
import java.util.List;

/**
 * This is a class for testing purposes of the Java code ecorification.
 */
public class SuperClass {
    public SuperClass() {
        System.out.println("No parameters!");
    }

    public SuperClass(int number) {
        System.out.println("Super: " + number);
    }

    public SuperClass(int number, BasicStroke stroke) {
        System.out.println(number + " " + stroke);
    }

    public SuperClass(int number, String text, Object[] array) {
        System.out.println(number + " " + text + " " + array);
    }

    public SuperClass(List<String> list) {
        System.out.println(list);
    }
}