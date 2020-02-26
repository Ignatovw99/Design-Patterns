package _2_Design_Patterns._1_Creatonal_Patterns._4_Singleton._8_Dependency_Injection_and_Testability_Issues;

import java.util.List;

public class SingletonDatabaseFinder {

    public int getTotalPopulation(List<String> capitals) {
        int result = 0;
        for (String capital : capitals) {
            result += SingletonDatabase.getInstance().getPopulation(capital);
        }
        return result;
    }
}
