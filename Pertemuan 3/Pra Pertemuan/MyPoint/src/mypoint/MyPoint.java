package mypoint;

/**
 *
 * @author U53R
 */
public class MyPoint {
    private int x,y;

    public MyPoint() {
        x = 0;
        y = 0;
    }
    
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public int[] getXY(){
        int[] koordinat = {x,y};
        return koordinat;
    }
    
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public String toString(){
        return "("+x+","+y+")";
    }
    
    public double distance(int x, int y){
        int jarakX = this.x - x;
        int jarakY = this.y - y;
        return Math.sqrt(jarakX*jarakX + jarakY*jarakY);
    }

    public double distance(MyPoint another){
        int jarakX = x - another.getX();
        int jarakY = y - another.getY();
        return Math.sqrt(jarakX*jarakX + jarakY*jarakY);
    }
    
    public double distance(){
        return Math.sqrt(this.x*this.x + this.y*this.y);
    }  
}
