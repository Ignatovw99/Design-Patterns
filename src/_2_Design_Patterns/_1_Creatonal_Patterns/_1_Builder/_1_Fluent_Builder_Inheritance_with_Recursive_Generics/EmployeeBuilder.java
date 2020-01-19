package _2_Design_Patterns._1_Creatonal_Patterns._1_Builder._1_Fluent_Builder_Inheritance_with_Recursive_Generics;

public class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {

    public EmployeeBuilder worksAt(String position) {
        person.setPosition(position);
        return self();
    }

    @Override
    protected EmployeeBuilder self() {
        return this;
    }
}
