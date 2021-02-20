package designpatterns.singleton;

/**
 * @author Joshua Bloch
 * This can't be destroyed by a reflection.
 * Because Java ensures that any enum value is instantiated only once in a Java program.
 */
public enum EnumSingleTon {
    INSTANCE, DUPLICATE;

    private static int prop1 = 10;
    private static String prop2 = "String";

    public int getProp1() {
        return prop1;
    }

    public String getProp2() {
        return prop2;
    }

    public void setProp1(int x) {
        prop1 = x;
    }

    public void setProp2(String x) {
        prop2 = x;
    }
}
