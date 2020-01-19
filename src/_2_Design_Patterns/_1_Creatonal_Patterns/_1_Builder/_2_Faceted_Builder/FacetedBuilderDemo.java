package _2_Design_Patterns._1_Creatonal_Patterns._1_Builder._2_Faceted_Builder;

import java.math.BigDecimal;

public class FacetedBuilderDemo {

    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();

        Person person = personBuilder
                .lives()
                    .at("123 London Road")
                    .in("London")
                    .withPostcode("SW12BC")
                .works()
                    .at("Aston Martin")
                    .as("Engineer")
                    .earning(new BigDecimal(4560000))
                .build();

        System.out.println(person);
    }
}
