package _2_Design_Patterns._1_Creatonal_Patterns._4_Singleton._8_Dependency_Injection_and_Testability_Issues;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class SingletonDatabase implements Database {

    private Dictionary<String, Integer> capitalsByPopulation = new Hashtable<>();

    private static int instanceCount = 0;

    public static int getInstanceCount() {
        return instanceCount;
    }

    private SingletonDatabase() {
        instanceCount++;
        System.out.println("Initializing database");

        try {
            File file = new File(
                    SingletonDatabase.class.getProtectionDomain().getCodeSource().getLocation().getPath()
            );
            Path path = Paths.get(file.getPath(), "capitals.txt");
            List<String> lines = Files.readAllLines(path);

            for (int i = 0; i < lines.size(); i+=2) {
                String town = lines.get(i).trim();
                int population = Integer.parseInt(lines.get(i + 1).trim());
                capitalsByPopulation.put(town, population);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static final SingletonDatabase INSTANCE = new SingletonDatabase();

    public static SingletonDatabase getInstance() {
        return INSTANCE;
    }

    @Override
    public int getPopulation(String capital) {
        return capitalsByPopulation.get(capital);
    }


}
