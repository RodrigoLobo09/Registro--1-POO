/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia1;

/**
 *
 * @author Lenovo
 */
public class ExecInfopx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
   System.out.println("-----DATOS DE PACIENTE-----");
        Infopx pedido1 = new Infopx();
        String nom;
        pedido1.establecernombre("Ricardo Daniel");
        nom = pedido1.obtenerNombre();
        System.out.println("Nombre del paciente es : "+nom);
        
        String apellido;
        pedido1.establecerApellidos("Lopez Barrera");
        apellido = pedido1.obtenerApellidos();
        System.out.println("Apellidos del paciente es : "+apellido);

       int edad;
       pedido1.estableceredad(50);
       edad = pedido1.obteneredad();
       System.out.println("Edad del paciente: "+edad); 
       
        String ingreso;
        pedido1.establecerIngreso( "Febrereo 20, 1989" );
        ingreso = pedido1.obtenerIngreso();
        System.out.println("Fecha de Ingreso del paciente es : "+ingreso);
        
        String egreso;
        pedido1.establecerEgreso( "Febrereo 25, 1989" );
        egreso = pedido1.obtenerEngreso();
        System.out.println("Fecha de Egreso del paciente es : "+egreso);
       
     
       } 
}
