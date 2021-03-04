/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3;

/**
 *
 * @author Lenovo
 */
public class Comp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //         Direccion d1 = new Direccion ("calle A",3);
        Info i1 = new Info ("naruto34@gmail.com",89695312);
        Info i2 = new Info ("happy.trip@gmail.com",22003569);
        Pasajero p= new Pasajero ("Felipe",19);
        p.setInfo(i1);
        Agencia a= new Agencia();
        a.setCodigo("00503SV");
        a.setInfo (i2);
        
        System.out.println(p.getInfo().getEmail());
         System.out.println(a.getInfo().getEmail());
    }
    
}
