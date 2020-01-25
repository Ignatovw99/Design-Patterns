package _2_Design_Patterns._1_Creatonal_Patterns._2_Factory._3_Abstract_Factory;

import org.javatuples.Pair;
import org.reflections.Reflections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class HotDrinkMachine {

    private List<Pair<String, HotDrinkFactory>> namedFactories;

    public HotDrinkMachine() {
        new Reflections(HotDrinkFactory.class)
                .getSubTypesOf(HotDrinkFactory.class)
                .forEach(subType -> {
                    try {
                        Pair<String, HotDrinkFactory> factoryPair = new Pair<>(
                                subType.getSimpleName().replace("Factory", ""),
                                subType.getDeclaredConstructor().newInstance()
                        );
                        namedFactories.add(factoryPair);
                    } catch (InstantiationException | NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                        e.printStackTrace();
                    }
                });
    }

    public HotDrink makeDrink() throws IOException {
        System.out.println("Available drinks: ");
        for (Pair<String, HotDrinkFactory> namedFactory : namedFactories) {
            System.out.println(namedFactories.indexOf(namedFactory) + ": " + namedFactory.getValue0());
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input;
        int index, amount;

        while ((input = reader.readLine()) != null && (index = Integer.parseInt(input)) >= 0 && index < namedFactories.size()) {
            System.out.println("Specify amount: ");
            input = reader.readLine();
            if (input != null && (amount = Integer.parseInt(input)) > 0) {
                return namedFactories.get(index).getValue1().prepare(amount);
            }
            System.out.println("Incorrect input, try again.");
        }
        return null;
    }
}
