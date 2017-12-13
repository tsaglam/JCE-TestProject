package jce.wrapping.mixed;

public class LowLevelClass extends MidLevelClass {

    public LowLevelClass() {
        System.out.println("LowLevelClass Constructor");
    }

    public static void main(String[] args) {
        new LowLevelClass();
    }
}
