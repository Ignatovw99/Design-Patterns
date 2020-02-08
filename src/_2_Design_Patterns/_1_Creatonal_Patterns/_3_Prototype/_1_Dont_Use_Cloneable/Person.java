package _2_Design_Patterns._1_Creatonal_Patterns._3_Prototype._1_Dont_Use_Cloneable;

import java.util.Arrays;

public class Person implements Cloneable {

    private String[] names;

    private Address address;

    public Person(String[] names, Address address) {
        this.names = names;
        this.address = address;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        return new Person(names.clone(), address.clone());
    }

    @Override
    public String toString() {
        return "Person{" +
                "names=" + Arrays.toString(names) +
                ", address=" + address +
                '}';
    }
}
