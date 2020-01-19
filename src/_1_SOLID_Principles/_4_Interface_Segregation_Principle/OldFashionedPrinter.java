package _1_SOLID_Principles._4_Interface_Segregation_Principle;

import _1_SOLID_Principles._4_Interface_Segregation_Principle.interfaces.Machine;

// This is a printer, which only prints. It does not support functionality as faxing and scanning
public class OldFashionedPrinter implements Machine {

    @Override
    public void print(Document document) {
        System.out.println("Print the document");
    }

    @Override
    public void fax(Document document) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void scan(Document document) {
        throw new UnsupportedOperationException();
    }
}
