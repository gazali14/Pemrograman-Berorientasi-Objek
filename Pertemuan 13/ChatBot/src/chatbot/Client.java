/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatbot;

/**
 *
 * @author U53R
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
 
public class Client {

    public static void main(String[] args) {
        try {
        Socket socket = new Socket("localhost", 1234);

        BufferedReader in = new BufferedReader(new
        InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        String message;

        while (true) {
            System.out.print("Anda: ");
            message = userInput.readLine();
            out.println(message);
            String response = in.readLine();
            System.out.println(response);
        }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
