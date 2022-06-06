package designpatterns.creational.builder.facetedBuilder;

/**
 * Created by SK on 10/28/2021
 **/
public class Demo {

  /**
   * both sub builder are extending from the main builder as they would have access to each other builder methods
   * making it fluent
   */

  public static void main(String[] args) {
    PersonBuilder pb = new PersonBuilder();
    Person person = pb
           .lives()
            .at("Old Trafford")
            .in("Manchester")
            .withPostcode("ABC56L")
           .works()
            .at("Siemens")
            .asA("Software developer")
            .earning(100000)
            .build();
    System.out.println(person);

  }
}
