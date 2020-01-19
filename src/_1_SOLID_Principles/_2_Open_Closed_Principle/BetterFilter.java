package _1_SOLID_Principles._2_Open_Closed_Principle;

import java.util.List;
import java.util.stream.Stream;

public class BetterFilter implements Filter<Product> {

    @Override
    public Stream<Product> filter(List<Product> items, Specification<Product> specification) {
        return items
                .stream()
                .filter(specification::isSatisfied);
    }
}
