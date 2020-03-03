package _2_Design_Patterns._2_Structural_Patterns._2_Bridge;

public class RasterRenderer implements Renderer {

    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing pixels fora circle of radius " + radius);
    }
}
