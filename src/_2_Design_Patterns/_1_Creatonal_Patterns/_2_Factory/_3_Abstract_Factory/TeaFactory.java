package _2_Design_Patterns._1_Creatonal_Patterns._2_Factory._3_Abstract_Factory;

public class TeaFactory implements HotDrinkFactory {
    @Override
    public HotDrink prepare(int amount) {
        System.out.println("Put in tea bag, boil water, pour " + amount + "ml, add lemon, enjoy!");
        return new Tea();
    }
}
