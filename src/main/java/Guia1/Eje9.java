/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia1;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Eje9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("Inicio del programa");
      System.out.println("Ingresa tu nombre: ");
       String nombre = "";
      
        
        Scanner nombreEscaner = new Scanner (System.in);
        nombre = nombreEscaner.nextLine();
        System.out.println("Introducir tu edad:");
        
        int edad;
        Scanner edadEscaner =new Scanner (System.in); 
        edad= edadEscaner.nextInt();
    System.out.println("Tu nombre es: "+ nombre);
    System.out.println("Tu edad es: "+edad);


    }
    
}
