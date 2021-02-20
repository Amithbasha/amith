package designpatterns.singleton;

/**
 * By making global access method synchronized makes it thread-safe.
 * pros: Threadsafe and lazy initialization
 * cons: synchronized makes it performance expensive.
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    /**
     * To avoid this extra overhead every time, double checked locking principle is used.
     * In this approach, the synchronized block is used inside the if condition with
     * an additional check to ensure that only one instance of a singleton class is created.
     * It somehow reduce the performance expensiveness.
     *
     * @return
     */
    public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) ;
                {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
