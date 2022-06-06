package solidprinciples.openclosed;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by SK on 10/23/2021
 **/
public class BetterFilter implements Filter <Product> {

  @Override
  public Stream <Product> filter(List <Product> items, Specification <Product> spec) {
    return items.stream().filter(item -> spec.isSatisfied(item));
  }
}
