package _2_Design_Patterns._1_Creatonal_Patterns._1_Builder._1_Fluent_Builder_Inheritance_with_Recursive_Generics;

public class PersonBuilder<SELF extends PersonBuilder<SELF>> {

    protected Person person;

    public PersonBuilder() {
        person = new Person();
    }

    public SELF withName(String name) {
        person.setName(name);
        return (SELF) this; // It is not necessary to cast it, because the generic type is always PersonBuilder type
    }

    protected SELF self() {
        return (SELF) this;
    }

    public Person build() {
        return person;
    }
}
