package uts1;

/**
 *
 * @author U53R
 */
import java.util.ArrayList;
import java.util.List;
public class Drawing {
    public List<Shape> shapes;

    public Drawing() {
    }
    
    public void addSHape(Shape shape){
        shapes = (List<Shape>) shape;
    }
    
    public void draw(){
        System.out.println("Drawing a shape");
    }
}
