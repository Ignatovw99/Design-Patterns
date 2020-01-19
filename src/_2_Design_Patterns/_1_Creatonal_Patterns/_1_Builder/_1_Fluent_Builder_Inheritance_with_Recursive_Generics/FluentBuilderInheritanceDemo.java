package _2_Design_Patterns._1_Creatonal_Patterns._1_Builder._1_Fluent_Builder_Inheritance_with_Recursive_Generics;

public class FluentBuilderInheritanceDemo {

    public static void main(String[] args) {
        EmployeeBuilder personBuilder = new EmployeeBuilder();

        Person lyuboslav = personBuilder
                .withName("Lyuboslav")
                .worksAt("Developer")
                .build();

        System.out.println(lyuboslav);
    }
}
