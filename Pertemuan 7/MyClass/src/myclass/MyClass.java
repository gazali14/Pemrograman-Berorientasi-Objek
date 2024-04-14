/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myclass;

/**
 *
 * @author U53R
 */
public class MyClass {
    private static int counter = 0;
    private  int id;

    public MyClass(int id) {
        id = counter++;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }
    
}


