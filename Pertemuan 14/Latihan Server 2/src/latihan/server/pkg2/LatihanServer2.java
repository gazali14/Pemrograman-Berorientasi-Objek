/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan.server.pkg2;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author U53R
 */
public class LatihanServer2 {
   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
        // TODO code application logic here
        int portNumber = 4444;
        boolean listening = true;
        try (
            ServerSocket serverSocket = new
            ServerSocket(portNumber);){
                while(listening){
                    Socket clientSocket = serverSocket.accept();
                    new ServerThread(clientSocket).start();
                }
        } catch (IOException ex) {
            Logger.getLogger(LatihanServer2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}