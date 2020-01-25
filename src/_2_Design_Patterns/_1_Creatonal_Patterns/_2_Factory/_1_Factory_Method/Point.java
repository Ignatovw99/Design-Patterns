package _2_Design_Patterns._1_Creatonal_Patterns._2_Factory._1_Factory_Method;

public class Point {

    private double x, y;

    private Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // This two factory methods force the user to create the object not with the constructor, because it is private, but with this two methods
    public static Point newCartesianPoint(double x, double y) {
        return new Point(x, y);
    }

    public static Point newPolarPoint(double rho, double theta) {
        return new Point(
                rho * Math.cos(theta),
                rho * Math.sin(theta)
        );
    }

    // The creation of a object with such a constructor is a bad practice
    public Point(double a, double b, CoordinateSystem coordinateSystem) {
        switch (coordinateSystem) {
            case POLAR:
                x = a * Math.cos(b);
                y = a * Math.sin(b);
                break;
            case CARTESIAN:
                x = a;
                y = b;
                break;
        }
    }

    // The overloading of constructors with same types is not allowed in OOP languages as Java, otherwise in Objective C and Swift it is possible to do this
//    public Point(double rho, double theta) {
//        x = rho * Math.cos(theta);
//        y = rho * Math.sin(theta);
//    }
}
