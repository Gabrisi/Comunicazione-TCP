/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package client.server;
import java.io.*;
import java.net.*;

/**
 *
 * @author gabri
 */
public class ClientMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Client c = new Client("gabriele","viola");
        c.connetti("127.0.0.1",2000);
        c.chiudi();
    }
    
}
