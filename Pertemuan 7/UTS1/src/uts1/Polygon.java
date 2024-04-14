package uts1;

/**
 *
 * @author U53R
 */
import java.util.ArrayList;
import java.util.List;
public class Polygon extends Shape {
    private List<Point> vertices;

    public Polygon(List<Point> vertices) {
        this.vertices = vertices;
    }

    @Override
    public void draw() {
        System.out.println("This is a Polygon");
    }
}
