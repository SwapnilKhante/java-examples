package designpatterns.creational.builder.exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SK on 10/28/2021
 **/
public class CodeBuilder {

    private String className;
    public List <Field> fields = new ArrayList <>();


  public CodeBuilder(String className) {
    this.className = className;
  }

  public CodeBuilder addField(String name, String type) {
    Field c = new Field(name, type);
    fields.add(c);
    return this;
  }

  @Override
  public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append(String.format("public class %s %s{%s", className, Field.newLine, Field.newLine ));
     fields.stream().forEach(f-> sb.append(f));
     sb.append("}");
     return sb.toString();
  }
}
