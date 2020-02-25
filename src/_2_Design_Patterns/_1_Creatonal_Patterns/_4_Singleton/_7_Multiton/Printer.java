package _2_Design_Patterns._1_Creatonal_Patterns._4_Singleton._7_Multiton;

import java.util.HashMap;
import java.util.Map;

/**
 * The Multiton is a variation of singleton with key-value stored instances with lazy loading
 */
public class Printer {

    private static int instanceCount = 0;

    private Printer() {
        Printer.instanceCount++;
        System.out.println("A total of " + Printer.instanceCount + " instances created so far.");
    }

    private static Map<Subsystem, Printer> instances = new HashMap<>();

    public static Printer get(Subsystem subsystem) {
        if (instances.containsKey(subsystem)) {
            return instances.get(subsystem);
        }

        // This is lazy loading
        Printer instance = new Printer();
        instances.put(subsystem, instance);
        return instance;
    }
}
