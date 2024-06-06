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
import java.net.ServerSocket;
import java.net.Socket;
 
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(1234);

            System.out.println("Server berjalan...");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Klien terhubung: " + clientSocket);

            BufferedReader in = new BufferedReader(new
            InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            String message;
            while ((message = in.readLine()) != null) {
                System.out.println("Pesan dari klien: " + message);
                String response = generateResponse(message);
                out.println(response);
            }

            in.close();
            out.close();
            clientSocket.close();
            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String generateResponse(String message){
        message = message.toLowerCase();
        String respons;
        if(message.contains("halo") ) respons = "Halo Juga ";
        else if (message.contains("kabar")) respons = "Kabar Baik";
        else if (message.contains("terima kasih")) respons = "Sama-sama";
        else respons ="Bye,Senang berbincang dengan anda";
        return "Chatbot: "+respons;
    }
}
