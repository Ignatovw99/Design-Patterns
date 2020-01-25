package _2_Design_Patterns._1_Creatonal_Patterns._2_Factory._4_Exercise;

public class PersonFactory {

    private static int ID = 0;

    public Person createPerson(String name) {
        return new Person(ID++, name);
    }
}
