package _2_Design_Patterns._1_Creatonal_Patterns._4_Singleton._7_Multiton;

public class MultitonDemo {

    public static void main(String[] args) {
        Printer mainPrinter = Printer.get(Subsystem.PRIMARY);
        Printer auxPrinter = Printer.get(Subsystem.AUXILIARY);
        Printer auxPrinter2 = Printer.get(Subsystem.PRIMARY);
    }
}
