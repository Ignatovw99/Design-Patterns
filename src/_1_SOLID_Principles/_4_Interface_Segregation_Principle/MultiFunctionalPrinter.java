package _1_SOLID_Principles._4_Interface_Segregation_Principle;

import _1_SOLID_Principles._4_Interface_Segregation_Principle.interfaces.Machine;

// It is ok if you need a multifunctional machine
public class MultiFunctionalPrinter implements Machine {

    @Override
    public void print(Document document) {

    }

    @Override
    public void fax(Document document) {

    }

    @Override
    public void scan(Document document) {

    }
}
