package uts1;

/**
 *
 * @author U53R
 */
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("This is a Rectangle");
    }
    
    
}
