package solidprinciples.openclosed;

/**
 * Created by SK on 10/23/2021
 **/
public class AndSpecification<T> implements Specification<T>{

    private final Specification<T> first, second;

    public AndSpecification(Specification <T> first, Specification <T> second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean isSatisfied(T item) {
        return first.isSatisfied(item) && second.isSatisfied(item);
    }
}
