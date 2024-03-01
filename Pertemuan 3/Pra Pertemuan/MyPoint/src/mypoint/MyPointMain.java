package mypoint;

/**
 *
 * @author U53R
 */
public class MyPointMain {
    public static void main (String args[]){
        MyPoint point = new MyPoint(3, 4);

        double distanceToSpecificPoint = point.distance(9, 12);
        System.out.println("Jarak dari titik tertentu: " + distanceToSpecificPoint);

        MyPoint anotherPoint = new MyPoint(3, 6);
        double distanceToAnotherPoint = point.distance(anotherPoint);
        System.out.println("Jarak dari titik lain: " + distanceToAnotherPoint);

        double distanceToOrigin = point.distance();
        System.out.println("Jarak dari titik origin " + distanceToOrigin);
    }
}
