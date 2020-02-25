package _2_Design_Patterns._1_Creatonal_Patterns._4_Singleton._5_Enum_Based_Singleton;

import java.io.*;

public class EnumBasedSingletonDemo {

    private static void saveToFile(EnumBasedSingleton enumBasedSingleton, String fileName) {
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(enumBasedSingleton);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static EnumBasedSingleton readFromFile(String fileName) {
        try (FileInputStream fileIn = new FileInputStream(fileName);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            return (EnumBasedSingleton) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new IllegalArgumentException();
        }
    }

    public static void main(String[] args) {
        String filename = "myfile.bin";

        EnumBasedSingleton enumBasedSingleton = EnumBasedSingleton.INSTANCE;
        enumBasedSingleton.setValue(111);
        saveToFile(enumBasedSingleton, filename);

        EnumBasedSingleton enumBasedSingleton2 = readFromFile(filename);

        System.out.println(enumBasedSingleton2.getValue());
    }
}
