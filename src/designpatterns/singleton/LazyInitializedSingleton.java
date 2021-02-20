package designpatterns.singleton;

/**
 * It will works fine in single-thread environment.
 * but when it comes to multithreaded systems, it can cause issues if multiple threads are
 * inside the if condition at the same time. It will destroy the singleton pattern
 * and both threads will get the different instances of the singleton class
 */
public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {
        /**
         * To make the constructor private. used to avoid the object creations from any other classes.
         * We can only create a object only from this class.
         */
    }

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
