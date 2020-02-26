package _2_Design_Patterns._1_Creatonal_Patterns._4_Singleton._8_Dependency_Injection_and_Testability_Issues;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    //@Test - this is not a unit test, it is integration, because it test many things
    public void singletonTotalPopulationTest() {
        SingletonDatabaseFinder singletonDatabaseFinder = new SingletonDatabaseFinder();
        List<String> capitals = List.of("London", "Istanbul");
        int totalPopulation = singletonDatabaseFinder.getTotalPopulation(capitals);
        //assertEquals(12412312, totalPopulation);
    }

    //@Test - this is a unit test
    public void dependentPopulationTest() {
        DummyDatabase dummyDatabase = new DummyDatabase();
        ConfigurableRecordFinder configurableRecordFinder = new ConfigurableRecordFinder(dummyDatabase);
        //assertEquals(4, configurableRecordFinder.getTotalPopulation(List.of("x", "y"));
    }
}
