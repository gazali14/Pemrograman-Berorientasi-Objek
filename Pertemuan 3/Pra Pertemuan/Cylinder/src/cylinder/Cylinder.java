package cylinder;

/**
 *
 * @author U53R
 */
public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder(Circle base, double height) {
        this.base = base;
        this.height = height;
    }

    public Circle getBase() {
        return base;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double volume() {
        return Math.PI * base.getRadius() * base.getRadius() * height;
    }
    
    public String toString() {
        return "Cylinder[" +base.toString() +", height=" +height +", volume= " +volume() +"]";
    }
}
