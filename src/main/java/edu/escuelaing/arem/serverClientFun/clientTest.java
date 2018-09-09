/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.serverClientFun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author camilolopez
 */
public class clientTest {

    Socket mySocket;
    PrintWriter out;
    BufferedReader in;

    public clientTest() throws IOException {
        try {
            mySocket = new Socket("127.0.0.1", 35000);
            out = new PrintWriter(mySocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(mySocket.getInputStream()));
        } catch (UnknownHostException e) {
            System.err.println("Don't about the host!");
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn't get I/0 for the connection to: localhost");
            System.exit(1);
        }
        
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        String userInput;

        while ((userInput = stdIn.readLine()) != null) {            
            out.println(userInput);
            System.out.println(in.readLine());
        }

        out.close();
        in.close();
        stdIn.close();
        mySocket.close();
    }
}
