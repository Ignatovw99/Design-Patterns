package _1_SOLID_Principles._5_Dependency_Inversion_Principle;

import org.javatuples.Triplet;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Relationships implements RelationshipBrowser { // It is low-level module

    private List<Triplet<Person, Relationship, Person>> relations = new ArrayList<>();

    public List<Triplet<Person, Relationship, Person>> getRelations() {
        return relations;
    }

    public void addParentAndChild(Person parent, Person child) {
        relations.add(new Triplet<>(parent, Relationship.PARENT, child));
        relations.add(new Triplet<>(child, Relationship.CHILD, parent));
    }

    //The actual research will be executed here, because it is not a good practice to expose low-level modules to high-level
    @Override
    public List<Person> findAllChildrenOf(String name) {
        return relations
                .stream()
                .filter(relation ->
                        Objects.equals(name, relation.getValue0().getName()) && Relationship.PARENT == relation.getValue1()
                )
                .map(Triplet::getValue2)
                .collect(Collectors.toList());
    }
}
