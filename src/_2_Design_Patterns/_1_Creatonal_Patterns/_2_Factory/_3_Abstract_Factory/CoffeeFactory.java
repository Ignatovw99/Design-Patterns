package _2_Design_Patterns._1_Creatonal_Patterns._2_Factory._3_Abstract_Factory;

public class CoffeeFactory implements HotDrinkFactory {
    @Override
    public HotDrink prepare(int amount) {
        System.out.println("Grind some beans, boil some water, pour " + amount + "ml, add cream and sugar, enjoy!");
        return new Coffee();
    }
}
