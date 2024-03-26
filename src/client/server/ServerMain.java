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

public class ServerMain {

    public static void main(String[] args) {
        Server s = new Server(2000);
        s.attendi();
        s.chiudi();
    }
    
}
