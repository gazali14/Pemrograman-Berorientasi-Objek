package movable;

/**
 *
 * @author U53R
 */
public class MovableCircleTest {
    public static void main (String args[]){
        Movable m1 = new MovablePoint(5, 6, 10, 10);  
        System.out.println("Titik awal Point : "+m1);
        
        m1.moveLeft();
        System.out.println("Titik setelah moveLeft : "+m1);        
        m1.moveUp();
        System.out.println("Titik setelah moveUp : "+m1);
        m1.moveRight();
        System.out.println("Titik setelah moveRight : "+m1);        
        m1.moveDown();
        System.out.println("Titik setelah moveDown : "+m1);        
        
        Movable m2 = new MovableCircle(2, 8,7, 17,14); 
        System.out.println("\nTitik awal Circle : "+m2);       
        m2.moveLeft();
        System.out.println("Titik setelah moveLeft : "+m2);
        m2.moveUp();
        System.out.println("Titik setelah moveUp : "+m2);
        m2.moveRight();
        System.out.println("Titik setelah moveRight : "+m2);
        m2.moveDown();
        System.out.println("Titik setelah moveDown : "+m2);
    }
}
