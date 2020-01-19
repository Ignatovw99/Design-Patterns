package _1_SOLID_Principles._2_Open_Closed_Principle;

// A new interface that is open for extension
public interface Specification<T> {

    boolean isSatisfied(T item);
}
