package _2_Design_Patterns._1_Creatonal_Patterns._4_Singleton._2_Static_Block_Singleton;

import java.io.File;
import java.io.IOException;

public class StaticBlockSingleton {

    private StaticBlockSingleton() throws IOException {
        System.out.println("Singleton is initializing...");
        File.createTempFile(".", ".");
    }

    private static StaticBlockSingleton instance;

    /*
    * This is a static block
    *
    * - it is used for static initialization of a class
    * - The code in static block is executed only once
    *   -> The first time you make an object or the first time you access a static member of that class(even if you never make an object of that class)
    *
    * - Static blocks are executed before constructors
    * */
    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (IOException e) {
            System.out.println("Failed to create singleton.");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
