package _2_Design_Patterns._1_Creatonal_Patterns._3_Prototype._2_Copy_Constructors;

public class Demo {

    public static void main(String[] args) {
        Employee john = new Employee("John", new Address("123 London Road", "London", "UK"));
        Employee chris = new Employee(john);
        chris.setName("Chris");
        System.out.println(john);
        System.out.println(chris);
    }
}
