package _2_Design_Patterns._1_Creatonal_Patterns._4_Singleton._3_Laziness_and_Thread_Safety;

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
        System.out.println("Initializing lazy singleton...");
    }

    /*
    * We initialize instance when somebody needs it (lazy initialization)
    *
    * This introduces potential race condition - for example when having several threads checking the instance for null
    * The one thread checks if variable is null the same time the other checks if the variable is null and then the both threads initialize the variable with different references
    * */
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    // One way to solve the thread safety problem is to make the method synchronized
//    public static synchronized LazySingleton getInstance() {
//        if (instance == null) {
//            instance = new LazySingleton();
//        }
//        return instance;
//    }

    // The other way to solve this problem is double-checked locking - it is a little bit outdated
//    public static LazySingleton getInstance() {
//        if (instance == null) {
//            // synchronized block with the desired class
//            synchronized (LazySingleton.class) {
//                if (instance == null) {
//                    instance = new LazySingleton();
//                }
//            }
//        }
//        return instance;
//    }
}
