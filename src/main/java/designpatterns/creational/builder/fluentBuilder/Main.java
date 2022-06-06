package designpatterns.creational.builder.fluentBuilder;

/**
 * Created by SK on 10/28/2021
 **/
public class Main {
    public static void main(String[] args) {

        // Fluent Builder inheritance
        EmployeeBuilder pb = new EmployeeBuilder();
        Person swapnil = pb
                .withName("Swapnil")
                .worksAt("Developer")
                .build();

        System.out.println(swapnil);

    }
}
