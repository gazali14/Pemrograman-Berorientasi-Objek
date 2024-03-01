package movable;

/**
 *
 * @author U53R
 */
public class MovableRectangle implements Movable {
    private MovablePoint topLeft, bottomRight;
    
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }
    
    public String toString() {
        return "topLeft:"+topLeft.toString()+ " and bottomRight : " +bottomRight.toString();
    }
    
    private boolean sameSpeed(){
        return (topLeft.xSpeed == bottomRight.xSpeed)&&
               (topLeft.ySpeed == bottomRight.xSpeed);
    }
    
    @Override
    public void moveUp(){
        if(! sameSpeed()){
            return;
        }
        topLeft.y -= topLeft.ySpeed;
        bottomRight.y -= bottomRight.ySpeed;
    }
    
    @Override
    public void moveDown(){
        if(! sameSpeed()){
            return;
        }
        topLeft.y += topLeft.ySpeed;
        bottomRight.y += bottomRight.ySpeed;
    }
    @Override
    public void moveLeft(){
        if(! sameSpeed()){
            return;
        }
        topLeft.x -= topLeft.xSpeed;
        bottomRight.x -= bottomRight.xSpeed;
    }
    @Override
    public void moveRight(){
        if(! sameSpeed()){
            return;
        }
        topLeft.x += topLeft.xSpeed;
        bottomRight.x += bottomRight.xSpeed;
    }
}
