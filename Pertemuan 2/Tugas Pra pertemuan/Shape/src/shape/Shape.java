package shape;

/**
 *
 * @author U53R
 */
public class Shape {

    private String color;
    private boolean filled;
    
    public Shape(){
        color = "Red";
        filled = true;
    }
    
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public boolean isFIlled(){
        return filled;
    }
    
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    
     public String toString() {
        if (!filled) {
            return "Shape [color = no color, filled = " + this.filled + "]";
        } else {
            return "Shape [color = " + this.color + ", filled = " + this.filled + "]";
        }
    } 
    
}
