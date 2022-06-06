package solidprinciples.openclosed;

/**
 * Created by SK on 10/23/2021
 **/
public class SizeSpecification implements Specification<Product> {

    private final Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.getSize().equals(size);
    }
}
