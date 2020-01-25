package _2_Design_Patterns._1_Creatonal_Patterns._2_Factory._4_Exercise;

public class ExerciseDemo {

    public static void main(String[] args) {
        PersonFactory personFactory = new PersonFactory();

        Person john = personFactory.createPerson("John");
        Person smith = personFactory.createPerson("Smith");

        System.out.println(john.getId());
        System.out.println(smith.getId());
    }
}
