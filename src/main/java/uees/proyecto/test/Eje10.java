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
public class Eje10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   System.out.println("Calculadora de propina");
        System.out.println("Introducir el monto de tu cuenta: ");
        double cuenta;
        double propina;
        Scanner cuentaEscaner =new Scanner (System.in);
        
        cuenta= cuentaEscaner.nextDouble();
       
       propina = cuenta * 0.13;
        System.out.println ("la propina que debes de dar es de : " + propina);
    }
    
}
