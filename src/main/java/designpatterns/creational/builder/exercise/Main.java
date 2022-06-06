package designpatterns.creational.builder.exercise;

/**
 * Created by SK on 10/28/2021
 **/
public class Main {
  public static void main(String[] args) {
    CodeBuilder codeBuilder =
            new CodeBuilder("Person")
                    .addField("String", "name")
                    .addField("int", "age");
    System.out.println(codeBuilder);
  }
}
