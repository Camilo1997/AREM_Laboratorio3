/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.URLReader;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Este programa muestra en pantalla cada uno de los metodos que se pueden usar
 * al crear un objeto de tipo URL, cada uno de estos da como salida un tipo
 * determinado de objeto.
 *
 * @author camilolopez
 */
public class urlMethods {

    public urlMethods() throws MalformedURLException {
        URL laInteriorismo = new URL("https://www.lainteriorismo.com:8080/docs/?a=b#Downloading");

        System.out.println("getProtocol() " + laInteriorismo.getProtocol());
        System.out.println("getAuthority() " + laInteriorismo.getAuthority());
        System.out.println("getHost() " + laInteriorismo.getHost());
        System.out.println("getPort() " + laInteriorismo.getPort());
        System.out.println("getPath() " + laInteriorismo.getPath());
        System.out.println("getQuery() " + laInteriorismo.getQuery());
        System.out.println("getFile() " + laInteriorismo.getFile());
        System.out.println("getRef() " + laInteriorismo.getRef());
    }

}
