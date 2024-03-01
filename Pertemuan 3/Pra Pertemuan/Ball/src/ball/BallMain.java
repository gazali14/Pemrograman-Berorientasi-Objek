package ball;

/**
 *
 * @author U53R
 */
public class BallMain {
    public static void main (String args[]){
        Ball ball = new Ball(20, 20, 5, 3, 5);
        System.out.println("Posisi awal bola : "+ball.toString());
        
        ball.move();
        System.out.println("Posisi bola setelah bergerak: "+ball.toString());
        
        ball.reflectHorizontal();
        System.out.println("Posisi bola setelah dipantulkan horizontal: "+ball.toString());
        
        ball.reflectVertical();
        System.out.println("Posisi bola setelah dipantulkan vertikal:"+ball.toString());
        
    }
}
