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
public class Eje8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          System.out.println("Programa para determinar el perimetro de un triangulo");
       System.out.println("Introduzca el los lados del triangulo:");
        double a;
        double b;
        double c;
        double peri;
        
          Scanner entradaEscaner =new Scanner (System.in);
        
        a = entradaEscaner.nextInt();
        b = entradaEscaner.nextInt();
        c = entradaEscaner.nextInt();
        peri = a + b +c;
        System.out.println("El perimetro de tu triangulo es de: "+peri);
    }
    
}
