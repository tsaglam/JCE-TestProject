package jce.generics;

import java.util.LinkedList;
import java.util.List;

public class GenericClass<T> {
    public GenericClass(T element) {
        list = new LinkedList<T>();
        add(element);
    }

    public void add(T element) {
        list.add(element);
        System.out.println("Added: " + element);
    }

    public void print() {
        System.out.println("Content: " + list);
    }

    List<T> list;

    public static void main(String[] args) {
        new GenericClass<String>("").print();
    }
}