package shape;

/**
 *
 * @author U53R
 */

public class Main_Circle {
    public static void main(String[] args) {
        // TODO code application logic here
        Circle c1 = new Circle();
        System.out.println(c1);
        System.out.println("Area = "+c1.getArea());
        System.out.println("Perimeter = "+c1.getPerimeter());
        
        Circle c2 = new Circle(7.0);
        c2.setColor("Green");
        c2.setFilled(false);
        System.out.println("\n"+c2);
        System.out.println("Area = "+c2.getArea());
        System.out.println("Perimeter = "+c2.getPerimeter());

    }   
}
