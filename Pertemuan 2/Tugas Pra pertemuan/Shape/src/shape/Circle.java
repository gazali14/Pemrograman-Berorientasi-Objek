package shape;

/**
 *
 * @author U53R
 */

public class Circle extends Shape {
    private double radius;
    
    public Circle() {
        super();
        radius = 1.0;
    }
    
    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea() {
        return Math.PI*radius*radius;
    }
    
    public double getPerimeter() {
        return Math.PI*radius*2;
    }
    
    @Override
    public String toString() {
        return "Circle[: subclass of " + super.toString() + " radius = " + radius+"]";
    }
}
