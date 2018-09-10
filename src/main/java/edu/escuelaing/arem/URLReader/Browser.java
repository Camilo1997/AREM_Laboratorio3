/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.URLReader;

import edu.escuelaing.arem.URLReader.urlReader;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.Scanner;

/**
 * Esta clase permite que el usuario ingrese la URL que se quiere analizar, el
 * metodo tiene la excepcion para revisar que la URL este correctamente
 * ingresada.
 *
 * @author camilolopez
 */
public class Browser {

    private String urlToUse;
    private Scanner userInput;
    private urlReader urlR;

    public Browser() throws MalformedURLException, FileNotFoundException, UnsupportedEncodingException {
        userInput = new Scanner(System.in);
        System.out.println("Ingrese la URL: ");
        urlToUse = userInput.next();
        urlR = new urlReader(urlToUse);
    }

    public String getUrlToUse() {
        return urlToUse;
    }

    public void setUrlToUse(String urlToUse) {
        this.urlToUse = urlToUse;
    }
}
