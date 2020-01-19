package _1_SOLID_Principles._4_Interface_Segregation_Principle;

import _1_SOLID_Principles._4_Interface_Segregation_Principle.interfaces.MultiFunctionalDevice;
import _1_SOLID_Principles._4_Interface_Segregation_Principle.interfaces.Printer;
import _1_SOLID_Principles._4_Interface_Segregation_Principle.interfaces.Scanner;

public class MultiFunctionalMachine implements MultiFunctionalDevice {

    private Printer printer;

    private Scanner scanner;

    public MultiFunctionalMachine(Printer printer, Scanner scanner) {
        this.printer = printer;
        this.scanner = scanner;
    }

    @Override
    public void print(Document document) {
        printer.print(document);
    }

    @Override
    public void scan(Document document) {
        scanner.scan(document);
    }
}
