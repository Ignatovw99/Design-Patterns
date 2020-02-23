package _2_Design_Patterns._1_Creatonal_Patterns._4_Singleton._4_Inner_Static_Singleton;

public class InnerStaticSingleton {

    private InnerStaticSingleton(){
    }

    private static class Impl {
        private static final InnerStaticSingleton INSTANCE = new InnerStaticSingleton();
    }

    /**
     *
     * This approach guarantee whenever you need the instance it initialize it lazily and it is thread safety.
     *
     * You will always get one instance whatever happens.
     */
    public InnerStaticSingleton getInstance() {
        return Impl.INSTANCE;
    }
}
