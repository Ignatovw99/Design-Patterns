package _1_SOLID_Principles._4_Interface_Segregation_Principle.interfaces;

import _1_SOLID_Principles._4_Interface_Segregation_Principle.Document;

public interface Machine {

    void print(Document document);

    void fax(Document document);

    void scan(Document document);
}
