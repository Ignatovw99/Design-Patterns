package _1_SOLID_Principles._4_Interface_Segregation_Principle;

import _1_SOLID_Principles._4_Interface_Segregation_Principle.interfaces.Printer;
import _1_SOLID_Principles._4_Interface_Segregation_Principle.interfaces.Scanner;

public class Photocopier implements Printer, Scanner {

    @Override
    public void print(Document document) {

    }

    @Override
    public void scan(Document document) {

    }
}
