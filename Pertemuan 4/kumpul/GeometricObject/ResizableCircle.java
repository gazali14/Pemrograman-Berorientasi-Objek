package geometricobject;

/**
 *
 * @author U53R
 */
public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius){
        super(radius);
    }
    @Override
    public String toString(){
        return "ResizableCircle: " + super.toString();
    }
    @Override
    public void resize(int percent) {
        radius *= (percent/100.0);
    }
}