package designpatterns.singleton;

/**
 * Static block initialization implementation is similar to eager initialization,
 * except that instance of class is created in the static block that provides option for exception handling.
 * cons: Its has same disadvantage of eager initialization approach.
 */
public class StaticBlockInitialization {

    private static final StaticBlockInitialization instance;

    static {
        try {
            instance = new StaticBlockInitialization();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static StaticBlockInitialization getInstance() {
        return instance;
    }
}
