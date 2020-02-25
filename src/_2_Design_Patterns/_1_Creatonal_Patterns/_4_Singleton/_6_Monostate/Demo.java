package _2_Design_Patterns._1_Creatonal_Patterns._4_Singleton._6_Monostate;

public class Demo {

    public static void main(String[] args) {
        ChiefExecutiveOfficer ceo = new ChiefExecutiveOfficer();
        ceo.setName("Adam Smith");
        ceo.setAge(32);

        ChiefExecutiveOfficer ceo2 = new ChiefExecutiveOfficer();
        System.out.println(ceo);
    }
}
