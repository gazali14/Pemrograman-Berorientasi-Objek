/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testcircle;

/**
 *
 * @author U53R
 */
public class TestCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle c1 = new Circle();
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());
        Circle c2 = new Circle(2.0);
        //c2.radius = 7.0; error
        c2.setRadius(7.0);
        System.out.println(c2);

    }   
}
