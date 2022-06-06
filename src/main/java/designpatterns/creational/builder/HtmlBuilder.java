package designpatterns.creational.builder;

/**
 * Created by SK on 10/28/2021
 **/
public class HtmlBuilder {

  private String rootName;
  private HtmlElement root = new HtmlElement();

  public HtmlBuilder(String rootName) {
    this.rootName = rootName;
    root.setName(rootName);
  }

  // returns html builder making it fluent
  public HtmlBuilder addChild(String childName, String childText) {
    HtmlElement e = new HtmlElement(childName, childText);
    root.getElements().add(e);
    return this;
  }

  /**
   * To Reset the root
   */
  public void clear() {
    root = new HtmlElement();
    root.setName(rootName);
  }

  @Override
  public String toString() {
    return root.toString();
  }
}
