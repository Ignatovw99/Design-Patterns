package _1_SOLID_Principles._2_Open_Closed_Principle;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter {

    public Stream<Product> filterByColor(List<Product> products, Color color) {
        return products
                .stream()
                .filter(product -> product.getColor() == color);
    }

    public Stream<Product> filterBySize(List<Product> products, Size size) {
        return products
                .stream()
                .filter(product -> product.getSize() == size);
    }

    public Stream<Product> filterByColorAndSize(List<Product> products, Color color, Size size) {
        return products
                .stream()
                .filter(product -> product.getColor() == color && product.getSize() == size);
    }

    // state space explosion
    // 3 criteria = 7 methods
}
