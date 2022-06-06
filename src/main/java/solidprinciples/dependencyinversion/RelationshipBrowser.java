package solidprinciples.dependencyinversion;

import java.util.List;

interface RelationshipBrowser {
  List <Person> findAllChildrenOf(String name);
}
