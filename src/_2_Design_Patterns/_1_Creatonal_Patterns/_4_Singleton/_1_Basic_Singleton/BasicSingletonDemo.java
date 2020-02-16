package _2_Design_Patterns._1_Creatonal_Patterns._4_Singleton._1_Basic_Singleton;

import java.io.*;

public class BasicSingletonDemo {

    // The class you want to write to a file has to be serializable
    // Serialization method
    private static void saveToFile(BasicSingleton basicSingleton, String fileName) {
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(basicSingleton);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Deserialization method
    private static BasicSingleton readFromFile(String fileName) {
        try (FileInputStream fileIn = new FileInputStream(fileName);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            return (BasicSingleton) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new IllegalArgumentException();
        }
    }

    public static void main(String[] args) {
        BasicSingleton basicSingleton = BasicSingleton.getInstance();
        basicSingleton.setValue(123);
        System.out.println(basicSingleton.getValue());

        /*
        * There are two problems using this type of singleton
        *
        * 1. Reflection
        *   - you can instantiate new instance of BasicSingleton class with reflection
        *
        * 2. Serialization
        *   - JVM does not care about singleton classes
        *   - See the problem here
        * */

        BasicSingleton singleton = BasicSingleton.getInstance();
        singleton.setValue(111);

        String fileName = "singleton.bin";
        saveToFile(singleton, fileName);
        basicSingleton.setValue(222);

        BasicSingleton singleton2 = readFromFile(fileName);

        System.out.println(singleton == singleton2);
        System.out.println("The value of singleton: " + singleton.getValue());
        System.out.println("The value of singleton2: " + singleton2.getValue());
    }
}
