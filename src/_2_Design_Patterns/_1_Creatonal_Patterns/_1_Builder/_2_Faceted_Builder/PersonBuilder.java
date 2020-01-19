package _2_Design_Patterns._1_Creatonal_Patterns._1_Builder._2_Faceted_Builder;

// builder facet -> Because it is a fluent interface builder it allows you to jump from one builder to another within method chaining
public class PersonBuilder {

    protected Person person;

    public PersonBuilder() {
        this.person = new Person();
    }

    // It exposes the two builders as methods
    public PersonAddressBuilder lives() {
        return new PersonAddressBuilder(person);
    }

    public PersonJobBuilder works() {
        return new PersonJobBuilder(person);
    }

    public Person build() {
        return person;
    }
}
