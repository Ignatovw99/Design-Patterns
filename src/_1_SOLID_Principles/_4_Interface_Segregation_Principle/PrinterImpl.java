package _1_SOLID_Principles._4_Interface_Segregation_Principle;

import _1_SOLID_Principles._4_Interface_Segregation_Principle.interfaces.Printer;

public class PrinterImpl implements Printer {

    @Override
    public void print(Document document) {
        System.out.println("Print the doc");
    }
}
