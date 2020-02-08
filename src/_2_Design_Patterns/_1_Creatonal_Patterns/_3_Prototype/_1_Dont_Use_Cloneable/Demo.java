package _2_Design_Patterns._1_Creatonal_Patterns._3_Prototype._1_Dont_Use_Cloneable;

public class Demo {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person john = new Person(new String[] { "John", "Smith" }, new Address("London Road", 123));

        //Shallow copying - We copy the reference from john to jane, and when we change something the changes will happen on both parts
        Person jane = john;
        jane.getNames()[0] = "Jane";
        jane.getAddress().setHouseNumber(124);

        System.out.println("Shallow copying");
        System.out.println(john);
        System.out.println(jane);

        // This is deep copying
        john = new Person(new String[] { "John", "Smith" }, new Address("London Road", 123));
        jane = john.clone();
        jane.getNames()[0] = "Jane";
        jane.getAddress().setHouseNumber(124);

        System.out.println();
        System.out.println("Deep copying");
        System.out.println(john);
        System.out.println(jane);
    }
}
