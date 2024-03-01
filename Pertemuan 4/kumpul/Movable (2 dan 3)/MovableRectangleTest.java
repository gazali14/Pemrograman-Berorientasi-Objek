package movable;

/**
 *
 * @author U53R
 */
public class MovableRectangleTest {
    public static void main (String args[]){
        Movable r1 = new MovableRectangle(0, 0, 50, 50, 10, 10);
        System.out.println("Titik awal rectangle : "+r1);
        
        r1.moveLeft();
        System.out.println("Titik setelah moveLeft :"+r1);
        
        r1.moveUp();
        System.out.println("Titik setelah moveUp :"+r1);
        
        r1.moveRight();
        System.out.println("Titik setelah moveRight :"+r1);
        
        
        r1.moveDown();
        System.out.println("Titik setelah moveDown :"+r1);
    }
}
