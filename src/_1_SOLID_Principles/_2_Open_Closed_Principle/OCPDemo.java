package _1_SOLID_Principles._2_Open_Closed_Principle;

import java.util.List;

public class OCPDemo {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);

        List<Product> products = List.of(apple, tree, house);

        ProductFilter productFilter = new ProductFilter();
        System.out.println("Green products with old specification filter:");
        productFilter.filterByColor(products, Color.GREEN)
                .forEach(product -> System.out.println(product.getName() + " is " + product.getColor().toString().toLowerCase()));

        BetterFilter betterFilter = new BetterFilter();
        System.out.println("Green products with new better specification filter:");
        betterFilter.filter(products, new ColorSpecification(Color.GREEN))
                .forEach(product -> System.out.println(product.getName() + " is " + product.getColor().toString().toLowerCase()));

        System.out.println("Large blue items:");
        betterFilter.filter(
                products, new AndSpecification<>(
                        new ColorSpecification(Color.BLUE),
                        new SizeSpecification(Size.LARGE)
                )
        )
                .forEach(product ->
                        System.out.println(product.getName() + " is " + product.getColor().toString().toLowerCase() + " and " + product.getSize().toString().toLowerCase()));
    }
}
