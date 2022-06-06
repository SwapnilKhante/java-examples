package solidprinciples.openclosed;

/**
 * Created by SK on 10/23/2021
 **/
public class ColorSpecification implements Specification<Product>{

    private final Color color;

    public ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.getColor().equals(color);
    }
}
