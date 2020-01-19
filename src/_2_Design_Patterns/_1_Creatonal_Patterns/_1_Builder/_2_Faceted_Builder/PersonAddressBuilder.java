package _2_Design_Patterns._1_Creatonal_Patterns._1_Builder._2_Faceted_Builder;

public class PersonAddressBuilder extends PersonBuilder {

    public PersonAddressBuilder(Person person) {
        this.person = person;
    }

    public PersonAddressBuilder at(String streetAddress) {
        person.setStreetAddress(streetAddress);
        return this;
    }

    public PersonAddressBuilder withPostcode(String postcode) {
        person.setPosition(postcode);
        return this;
    }

    public PersonAddressBuilder in(String city) {
        person.setCity(city);
        return this;
    }
}
