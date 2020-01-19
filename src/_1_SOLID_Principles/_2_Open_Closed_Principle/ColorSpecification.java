package _1_SOLID_Principles._2_Open_Closed_Principle;

class ColorSpecification implements Specification<Product> {

    private Color color;

    public ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product product) {
        return product.getColor() == color;
    }
}
