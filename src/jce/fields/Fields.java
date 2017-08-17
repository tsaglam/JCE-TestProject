package jce.fields;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Exchanger;

import jce.types.SomeClass;
import jce.types.SomeInterface;

/**
 * This is a class for testing purposes of the Ecore metamodel extraction.
 */
@SuppressWarnings("unused")
public class Fields {
    // basic:
    private int number;
    private String text;
    private Integer intObject;
    private char someCharacterWithAVeryLongNameWhichIsAbsolutlyRidiculous;

    // array:
    // private int[] intArray;
    // private char[][] charArray2D;
    // private String[][][] stringArray3D;
    // private Date[] dateArray;

    // with generic arguments:
    // private List<String> someList;
    private Map<Integer, String> someMap;
    // private List<SomeClass> someClassList;
    private Set<Map<Object, List<String>>> bigBadSet;

    // external types:
    private Exchanger<String> someWeirdExternalDataType;
    private List<Exchanger<String>> listOfExternal;

    // References
    private SomeClass someClass;
    private SomeInterface someInterface;
    // private CustomGenericClass<String, SomeClass> complexReference;
}