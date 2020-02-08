package _2_Design_Patterns._1_Creatonal_Patterns._3_Prototype._3_Copy_Through_Serialization;

import java.io.Serializable;

public class Address implements Serializable {

    private String street;

    private Integer number;

    public Address(String street, Integer number) {
        this.street = street;
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", number=" + number +
                '}';
    }
}
