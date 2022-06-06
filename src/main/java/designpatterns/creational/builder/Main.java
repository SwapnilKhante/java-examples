package designpatterns.creational.builder;

/**
 * when piece wise object construction is complicated, provide and API for doing it succinctly (brief and clearly expressed manner)
 * Build an object piece by piece
 */
public class Main {

  public static void main(String[] args) {
    HtmlBuilder builder = new HtmlBuilder("ul");
    builder
            .addChild("li", "hello")
            .addChild("li", "world");
    System.out.println(builder);

  }

  /*
  <ul>
  <li>
    hello
  <li>
  <li>
    world
  <li>
<ul>
   */

}
