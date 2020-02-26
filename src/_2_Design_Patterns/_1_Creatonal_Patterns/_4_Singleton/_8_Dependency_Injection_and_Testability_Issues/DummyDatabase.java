package _2_Design_Patterns._1_Creatonal_Patterns._4_Singleton._8_Dependency_Injection_and_Testability_Issues;

import java.util.Dictionary;
import java.util.Hashtable;

public class DummyDatabase implements Database {

    private Dictionary<String, Integer> data = new Hashtable<>();

    public DummyDatabase() {
        data.put("x", 1);
        data.put("y", 2);
        data.put("z", 3);
    }

    @Override
    public int getPopulation(String name) {
        return data.get(name);
    }
}
