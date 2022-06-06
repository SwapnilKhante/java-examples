package solidprinciples.dependencyinversion;

import java.util.List;

// high level module who accesses low level modules
class Research {

  // constructor accepting low level module is violating the dependency inversion principle
/*  public Research(Relationships relationships) {
    // high-level: find all of John's children
    List <Triplet <Person, Relationship, Person>> relations = relationships.getRelations();
    relations
            .stream()
            .filter(x -> x.getValue0().name.equals("John") && x.getValue1() == Relationship.PARENT)
            .forEach(ch -> System.out.println("John has a child called " + ch.getValue2().name));
  }*/

  public Research(RelationshipBrowser browser) {
    List <Person> children = browser.findAllChildrenOf("John");
    for (Person child : children)
      System.out.println("John has a child called " + child.name);
  }
}