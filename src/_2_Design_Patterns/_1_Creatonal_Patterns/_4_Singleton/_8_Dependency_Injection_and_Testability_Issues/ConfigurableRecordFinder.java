package _2_Design_Patterns._1_Creatonal_Patterns._4_Singleton._8_Dependency_Injection_and_Testability_Issues;

import java.util.List;

public class ConfigurableRecordFinder {

    private Database database;

    public ConfigurableRecordFinder(Database database) {
        this.database = database;
    }

    public int getTotalPopulation(List<String> capitals) {
        int result = 0;
        for (String capital : capitals) {
            result += database.getPopulation(capital);
        }
        return result;
    }
}
