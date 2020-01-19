package _1_SOLID_Principles._2_Open_Closed_Principle;

import java.util.List;
import java.util.stream.Stream;

// A new interface that is open for extension
public interface Filter<T> {

    Stream<T> filter(List<T> items, Specification<T> specification);
}
