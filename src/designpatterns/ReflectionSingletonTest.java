package designpatterns;

import designpatterns.singleton.EagerInitializedSingleton;

import java.lang.reflect.Constructor;

/**
 * Reflection can be used to destroy most of the singleton approaches.
 * Reflection is very powerful and used in a lot of frameworks like Spring and Hibernate
 */
public class ReflectionSingletonTest {

    public static void main(String[] args) {
        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = null;
        try {
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
        System.out.println("Ta Da... Your Singleton Pattern is crashed...");
    }
}
