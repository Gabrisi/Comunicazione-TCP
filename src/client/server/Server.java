/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabri
 */
public class Server {
    ServerSocket serverSocket;
    Socket clientSocket;
    int porta;
    
    public Server(int porta){
        this.porta=porta;
        try {
            serverSocket = new ServerSocket(123);
            System.out.println("il server è in ascolto");
        } //gestire eccezione
        catch (IOException ex) {
            System.err.println("server non puo mettersi in ascolto");
        }
    }
    public Socket attendi(){
        Socket s = null;
        try {
            clientSocket = serverSocket.accept();
        } catch (IOException ex) {
            System.err.println("il server non puo rispondere");
        }
        
        return clientSocket;
    }
    
    public void chiudi(){
        try {
            clientSocket.close();
            System.out.println("chiusura connessione con il client avvenuta");
        } catch (IOException ex) {
            System.err.println("errore nella chiuisura della connessione con il cleint");
        }
    }
}
