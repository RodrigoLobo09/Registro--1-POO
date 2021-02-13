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
public class Eje6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Programa para determinar el area de un cuadro");
       System.out.println("Introduzca el ancho y el largo de su cuadro");
        double a;
        double b;
        double area;
        
          Scanner entradaEscaner =new Scanner (System.in);
        
        a = entradaEscaner.nextInt();
        b = entradaEscaner.nextInt();
        area = a * b;
        System.out.println("El area de su cuadrado es de: "+area);
        
    }
    
}
