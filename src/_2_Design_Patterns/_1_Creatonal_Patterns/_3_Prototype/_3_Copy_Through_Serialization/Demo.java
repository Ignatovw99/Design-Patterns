package _2_Design_Patterns._1_Creatonal_Patterns._3_Prototype._3_Copy_Through_Serialization;

import org.apache.commons.lang3.SerializationUtils;

public class Demo {

    public static void main(String[] args) {
        Address address = new Address("London Road", 124);
        Address address1 = SerializationUtils.roundtrip(address); // It works with reflection

        address1.setStreet("Liverpool Road");

        System.out.println(address);
        System.out.println(address1);
    }
}
