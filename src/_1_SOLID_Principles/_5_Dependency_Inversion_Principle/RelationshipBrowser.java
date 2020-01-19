package _1_SOLID_Principles._5_Dependency_Inversion_Principle;

import java.util.List;

// This is the abstraction, which solves the problem with dependency of high-level modules on low-level
public interface RelationshipBrowser {

    List<Person> findAllChildrenOf(String name);
}
