package _2_Design_Patterns._2_Structural_Patterns._1_Adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdapterDemo {

    private static List<VectorObject> vectorObjects = new ArrayList<>(
            Arrays.asList(
                    new VectorRectangle(1, 1, 10, 10),
                    new VectorRectangle(3, 3, 6, 6)
            )
    );

    public static void drawPoint(Point p) {
        System.out.println(".");
    }

    public static void draw() {
        for (VectorObject vectorObject : vectorObjects) {
            for (Line line : vectorObject) {
                LineToPointAdapter adapter = new LineToPointAdapter(line);
                adapter
                        .forEach(AdapterDemo::drawPoint);
            }
        }
    }

    public static void main(String[] args) {
        draw();
        draw();
    }
}
