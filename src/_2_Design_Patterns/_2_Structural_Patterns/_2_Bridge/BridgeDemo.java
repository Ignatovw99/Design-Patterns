package _2_Design_Patterns._2_Structural_Patterns._2_Bridge;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class BridgeDemo {

    public static void main(String[] args) {
//        Renderer rasterRenderer = new RasterRenderer();
//        Renderer vectorRenderer = new VectorRenderer();
//
//        Circle circle = new Circle(vectorRenderer, 5);
//        circle.draw();
//        circle.resize(2);
//        circle.draw();

        Injector injector = Guice.createInjector(new ShapeModule());
        Circle circle = injector.getInstance(Circle.class);
        circle.setRadius(3);
        circle.draw();
        circle.resize(2);
        circle.draw();
    }
}
