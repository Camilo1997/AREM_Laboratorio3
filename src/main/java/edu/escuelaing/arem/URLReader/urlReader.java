/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.URLReader;

import java.io.*;
import java.net.*;

/**
 * Este programa escribe el codigo HTML de una pagina determinada por el usuario
 * en un archivo llamado urlWeb.html, la cual puede ser abierta en un navegador
 * y mostrara la pagina que se ha guardado.
 *
 * @author camilolopez
 */
public class urlReader {

    public urlReader(String urlToUse) throws MalformedURLException, FileNotFoundException, UnsupportedEncodingException {
        URL google = new URL(urlToUse);
        PrintWriter pw = new PrintWriter("contentWeb.html", "UTF-8");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(google.openStream()))) {
            String inputLine = null;
            while ((inputLine = reader.readLine()) != null) {
                pw.println(inputLine);
            }
            pw.close();
        } catch (IOException x) {
            System.err.println(x);
        }
    }

}
