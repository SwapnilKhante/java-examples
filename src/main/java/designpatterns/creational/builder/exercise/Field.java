package designpatterns.creational.builder.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by SK on 10/28/2021
 **/
public class Field {

  public String name, type;

  public static final int indentSize = 2;
  public static final String newLine = System.lineSeparator();

  public Field() {
  }

  public Field(String name, String type) {
    this.name = name;
    this.type = type;
  }

  @Override
  public String toString() {
    String temp = String.join("", Collections.nCopies( indentSize, " "));
    return String.format("%spublic %s %s; %s", temp, name, type, newLine );
  }

}
