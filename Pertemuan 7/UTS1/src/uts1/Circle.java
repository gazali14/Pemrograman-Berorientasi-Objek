package uts1;

/**
 *
 * @author U53R
 */
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    
    public Circle(int radius) {
        this.radius = radius;
    }
    
    
    @Override
    public void draw() {
        System.out.println("This is a Circle");
    }
}
