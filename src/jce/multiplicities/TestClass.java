package jce.multiplicities;

import java.util.LinkedList;
import java.util.List;

public class TestClass {

    private List<Double> doubleList;

    private List<Foo> fooList;

    private LinkedList<String> linkedList;

    private int number;

    private String text;

    public static void main(String[] args) {
        System.out.println(new TestClass().getFooList().size());
    }

    public List<Double> filterDoubles(List<Double> list) {
        return list;
    }

    public List<Foo> filterFoos(List<Foo> list) {
        return list;
    }

    public List<Double> getDoubleList() {
        return doubleList;
    }

    public List<Foo> getFooList() {
        return fooList;
    }

    public LinkedList<String> getLinkedList() {
        return linkedList;
    }

    public int getNumber() {
        return number;
    }

    public String getText() {
        return text;
    }

    public int numbers(int number) {
        return number;
    }

    public void setDoubleList(List<Double> doubleList) {
        this.doubleList = doubleList;
    }

    public void setFooList(List<Foo> fooList) {
        this.fooList = fooList;
    }

    public void setLinkedList(LinkedList<String> linkedList) {
        this.linkedList = linkedList;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String texts(String text) {
        return text;
    }
}
