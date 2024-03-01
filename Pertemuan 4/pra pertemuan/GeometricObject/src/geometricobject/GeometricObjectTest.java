package geometricobject;

/**
 *
 * @author U53R
 */

public class GeometricObjectTest {
    public static void main(String[] args) {
        ResizableCircle circle = new ResizableCircle(14.0);
        System.out.println(circle);
        System.out.format("Area = %.2f\n",circle.getArea());
        System.out.format("Perimeter = %.2f\n",circle.getPerimeter());
        
        circle.resize(50);
        System.out.println("\nResize circle by 50%");
        System.out.println(circle);
        System.out.format("Area= %.5f\n",circle.getArea());
        System.out.format("Perimeter = %.2f\n",circle.getPerimeter());
    
    }
}
