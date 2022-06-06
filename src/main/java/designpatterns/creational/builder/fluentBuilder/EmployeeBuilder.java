package designpatterns.creational.builder.fluentBuilder;

/**
 * Created by SK on 10/28/2021
 **/
public class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {

  public EmployeeBuilder worksAt(String position) {
    person.setPosition(position);
    return self();
  }

    @Override
    protected EmployeeBuilder self() {
        return this;
    }
}
