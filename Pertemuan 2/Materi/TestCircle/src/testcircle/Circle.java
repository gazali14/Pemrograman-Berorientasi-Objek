/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcircle;

/**
 *
 * @author U53R
 */
public class Circle {
    private double radius;
    
    public Circle() {
        radius = 1.0;
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea() {
        return Math.PI*radius*radius;
    }
    
    public double getCircumference() {
        return Math.PI*radius*2;
    }
    
    public String toString(){
        return "Circle[radius=" + radius +"]";
    }
}
