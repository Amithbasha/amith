package designpatterns;

import designpatterns.singleton.EnumSingleTon;

public class TestDesignPatterns {

    public static void main(String[] args) {
        var obj = EnumSingleTon.INSTANCE;
        var dup = EnumSingleTon.DUPLICATE;
        System.out.println(obj.getProp1());
        System.out.println(obj.getProp2());
        System.out.println(dup.getProp1());
        System.out.println(dup.getProp2());
        dup.setProp1(25);
        dup.setProp2("Hello");
        System.out.println(obj.getProp1());
        System.out.println(obj.getProp2());
        System.out.println(dup.getProp1());
        System.out.println(dup.getProp2());
    }
}
