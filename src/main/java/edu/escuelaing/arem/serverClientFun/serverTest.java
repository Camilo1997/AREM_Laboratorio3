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
import java.net.ServerSocket;
import java.net.Socket;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

/**
 *
 * @author camilolopez
 */
public class serverTest {

    String functionInUse = "cos";
    double resultado = 0;

    public serverTest() throws IOException {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(35000);
        } catch (IOException e) {
            System.err.println("Couldn't listen on port: 35000");
            System.exit(1);
        }

        Socket clientSocket = null;
        try {
            clientSocket = serverSocket.accept();
        } catch (IOException e) {
            System.err.println("Accept failed");
            System.exit(1);
        }

        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        String inputLine, outputLine;

        while ((inputLine = in.readLine()) != null) {
            if (!NumberUtils.isCreatable(inputLine)) {                
                if (inputLine.equals("fun:cos")) {
                    functionInUse = "cos";
                } else if (inputLine.equals("fun:sin")) {
                    functionInUse = "sin";
                } else if (inputLine.equals("fun:tan")) {
                    functionInUse = "tan";
                }
                outputLine = "Funcion usada: " + functionInUse;                        
                out.println(outputLine);                
            } else {
                if (functionInUse == "cos") {
                    resultado = Math.cos(Double.parseDouble(inputLine));
                } else if (functionInUse == "tan") {
                    resultado = Math.tan(Double.parseDouble(inputLine));
                } else {
                    resultado = Math.sin(Double.parseDouble(inputLine));
                }                
                outputLine = "Resultado obtenido con funcion " + functionInUse + " es: " + resultado;                        
                out.println(outputLine);
            }
        }

        out.close();
        in.close();
        clientSocket.close();
        serverSocket.close();
    }

}
