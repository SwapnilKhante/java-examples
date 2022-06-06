package solidprinciples.openclosed;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by SK on 10/23/2021
 **/
public interface Filter<T> {

    Stream <T> filter(List<T> items, Specification<T> spec);

}
