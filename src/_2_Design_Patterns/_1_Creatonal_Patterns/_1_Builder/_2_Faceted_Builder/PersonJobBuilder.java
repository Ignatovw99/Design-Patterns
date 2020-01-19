package _2_Design_Patterns._1_Creatonal_Patterns._1_Builder._2_Faceted_Builder;

import java.math.BigDecimal;

public class PersonJobBuilder extends PersonBuilder {

    public PersonJobBuilder(Person person) {
        this.person = person;
    }

    public PersonJobBuilder at(String companyName) {
        person.setCompanyName(companyName);
        return this;
    }

    public PersonJobBuilder as(String position) {
        person.setPosition(position);
        return this;
    }

    public PersonJobBuilder earning(BigDecimal annualIncome) {
        person.setAnnualIncome(annualIncome);
        return this;
    }
}
