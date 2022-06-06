package solidprinciples.openclosed;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by SK on 10/23/2021
 **/
public class ProductFilter {

    // the problem with this approach is that we might have different filter criteria like filter by size of filter by
    // both size and color and may be something new in the future.

    // to cater this problem we will use specification design pattern
    public Stream <Product> filterByColor(List <Product> products, Color color) {
        return products.stream().filter(product -> product.getColor() == color);
    }
}
