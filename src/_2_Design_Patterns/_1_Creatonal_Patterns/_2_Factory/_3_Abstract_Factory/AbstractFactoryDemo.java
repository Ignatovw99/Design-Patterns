package _2_Design_Patterns._1_Creatonal_Patterns._2_Factory._3_Abstract_Factory;

import java.io.IOException;

public class AbstractFactoryDemo {

    public static void main(String[] args) throws IOException {
        HotDrinkMachine machine = new HotDrinkMachine();
        HotDrink drink = machine.makeDrink();
        drink.consume();
    }
}
