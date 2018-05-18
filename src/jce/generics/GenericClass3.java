package jce.generics;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;

public class GenericClass3<T extends Comparable<ArrayList<String>> & IFace<Comparable<LinkedList<Serializable>>>> {

}