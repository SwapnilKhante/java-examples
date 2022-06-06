package designpatterns.creational.builder.facetedBuilder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by SK on 10/28/2021
 **/
@Getter
@Setter
@ToString
public class Person {
    private String streetAddress, postcode, city;
    //employment Information
    private String companyName, position;
    private int annualIncome;
}
