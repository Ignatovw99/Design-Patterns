package _1_SOLID_Principles._3_Liskov_Substitution_Principle;

public class LSPDemo {

    private static void useIt(Rectangle rectangle) {
        int width = rectangle.getWidth();
        rectangle.setHeight(10);
        System.out.println("Expected area of " + (width * 10) + ", got " + rectangle.getArea());
    }

    // The both objects are not replaceable ;(
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3);
        useIt(rectangle);

        Rectangle square = new Square();
        square.setHeight(5);
        square.setWidth(15);
        useIt(square);
    }
}
