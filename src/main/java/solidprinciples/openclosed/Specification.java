package solidprinciples.openclosed;

/**
 * Created by SK on 10/23/2021
 **/
public interface Specification<T> {

  boolean isSatisfied(T item);
}
