package _2_Design_Patterns._2_Structural_Patterns._2_Bridge;

public class VectorRenderer implements Renderer {

    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing a circle of radius " + radius);
    }
}
