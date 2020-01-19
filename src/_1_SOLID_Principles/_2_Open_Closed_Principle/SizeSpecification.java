package _1_SOLID_Principles._2_Open_Closed_Principle;

public class SizeSpecification implements Specification<Product> {

    private Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product product) {
        return product.getSize() == size;
    }
}
