package shape;

/**
 *
 * @author U53R
 */

public class Main_Rectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        System.out.println("---Rectangle 1---");
        System.out.println(rectangle1);
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());
        
        Rectangle rectangle2 = new Rectangle(5.0, 3.0);
        System.out.println("\n---Rectangle 2---");
        System.out.println(rectangle2);
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
        
        Rectangle rectangle3 = new Rectangle(4.0, 5.0, "Yellow", false);
        System.out.println("\n---Rectangle 3---");
        System.out.println(rectangle3);
        System.out.println("Area: " + rectangle3.getArea());
        System.out.println("Perimeter: " + rectangle3.getPerimeter());
        
    }
}
