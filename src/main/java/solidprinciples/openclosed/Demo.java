package solidprinciples.openclosed;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by SK on 10/23/2021
 **/
public class Demo {

    // We will demo Open closed principle and Specification design patter (Enterprise design pattern)
    // Open to extension and close for modification

  public static void main(String[] args) {

    Product apple = new Product("Apple", Size.SMALL, Color.GREEN);
    Product tree = new Product("Tree", Size.LARGE, Color.GREEN);
    Product house = new Product("House", Size.LARGE, Color.BLUE);

    List <Product> products = List.of(apple, tree, house);
    System.out.println("-- Incorrect way --");
    ProductFilter productFilter = new ProductFilter();
    productFilter
            .filterByColor(products, Color.GREEN)
            .forEach(System.out::println);

    System.out.println("--After refactoring using Specification Pattern");

    ColorSpecification specification = new ColorSpecification(Color.GREEN);
    BetterFilter betterFilter = new BetterFilter();
    betterFilter.filter(products, specification)
            .forEach(System.out::println);

    System.out.println("Using a generic combinator");
    Stream <Product> largeAndBlue = betterFilter.filter(products, new AndSpecification <>(
            new ColorSpecification(Color.BLUE),
            new SizeSpecification(Size.LARGE)
    ));
    largeAndBlue.forEach(System.out::println);
  }
}
