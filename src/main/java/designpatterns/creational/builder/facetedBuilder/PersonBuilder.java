package designpatterns.creational.builder.facetedBuilder;

/**
 * Created by SK on 10/28/2021
 **/
public class PersonBuilder {

  protected Person person = new Person();

  public PersonAddressBuilder lives(){
    return new PersonAddressBuilder(person);
  }

  public PersonJobBuilder works() {
    return new PersonJobBuilder(person);
  }

  public Person build() {
      return person;
  }


}
