/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.datagramas;

/**
 *
 * @author camilolopez
 */
public class DatagramServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (true) {
            DatagramTimeServer ds = new DatagramTimeServer();
            ds.startServer();
        }
    }

}
