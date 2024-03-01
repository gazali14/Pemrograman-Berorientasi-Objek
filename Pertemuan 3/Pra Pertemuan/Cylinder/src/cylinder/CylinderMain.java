package cylinder;

/**
 *
 * @author U53R
 */
public class CylinderMain {
  public static void main(String[] args) {
    Circle circle = new Circle(7, "Red");
    Cylinder cylinder = new Cylinder(circle, 12);
    System.out.println(cylinder);
    
  }
}