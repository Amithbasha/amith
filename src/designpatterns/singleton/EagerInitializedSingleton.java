package designpatterns.singleton;

/**
 * EagerInitialized Singleton is one of simple way to create a singleton design pattern
 * This approach has its own pros and cons.
 * pros: Its uses much less resources.
 * cons: Instance is created even though the client application might not be using it.
 * When we work with enterprise level applications, we have a lot of classes, In this approch all of
 * then are created at a class loading time. It makes this approach memory expensive.
 */
public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {
        /**
         * To make the constructor private. used to avoid the object creations from any other classes.
         * We can only create a object only from this class.
         */
    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}
