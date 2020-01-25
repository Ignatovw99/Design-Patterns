package _2_Design_Patterns._1_Creatonal_Patterns._2_Factory._2_Factory_Class;

public class FactoryDemo {

    public static void main(String[] args) {
        Point point = Point.Factory.newCartesianPoint(3, 8);
    }
}
