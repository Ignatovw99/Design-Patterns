package _1_SOLID_Principles._5_Dependency_Inversion_Principle;

import org.javatuples.Triplet;

import java.util.List;

public class Research { // It is high-level module

    // Here we broke the dependency inversion principle
//    public Research(Relationships relationships) {
//        List<Triplet<Person, Relationship, Person>> relations = relationships.getRelations();
//        relations.stream()
//                .filter(relation ->
//                        ("John").equals(relation.getValue0().getName())
//                                && Relationship.PARENT.equals(relation.getValue1()))
//                .forEach(filteredRelation -> System.out.println(
//                        filteredRelation.getValue0().getName() + " has a child called " + filteredRelation.getValue2().getName())
//                );
//    }

    // Here we use dependency inversion principle correctly, because we depend on an abstraction
    public Research(RelationshipBrowser relationshipBrowser) {
        relationshipBrowser.findAllChildrenOf("John")
                .forEach(child -> System.out.println("John has a child called " + child.getName()));
    }
}
