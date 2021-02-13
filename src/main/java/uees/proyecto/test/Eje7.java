/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uees.proyecto.test;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Eje7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
System.out.println("Programa de saludo de computadora");
System.out.println("Ingresa tu nombre:");

String namae = "";
Scanner namaeEscaner = new Scanner (System.in);
        namae = namaeEscaner.nextLine();
        System.out.println("Hola es un gusto conocerte\""+namae +"\"");

    }
    
}
