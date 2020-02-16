package _2_Design_Patterns._1_Creatonal_Patterns._4_Singleton._1_Basic_Singleton;

import java.io.Serializable;

public class BasicSingleton implements Serializable {

    private int value;

    //The private constructor prevents other users to instantiate this class
    private BasicSingleton() {
    }

    //This is the only instance of the class you are going to use
    private static final BasicSingleton INSTANCE = new BasicSingleton();

    //When serialization or deserialization happen it should be in the context of the INSTANCE variable - it looks for this method
    protected Object readResolve() {
        return INSTANCE;
    }

    // This is how you can expose singleton instance itself
    public static BasicSingleton getInstance() {
        return INSTANCE;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
