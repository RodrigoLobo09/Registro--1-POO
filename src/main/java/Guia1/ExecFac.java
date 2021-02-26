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
public class ExecFac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Factura pedido1 = new Factura();
        String desc1;
        pedido1.establecerDescPieza("taladro black and decker de medio caballo de potencia para banco");
        desc1 = pedido1.obtenerDescPieza();
        System.out.println("La descripcion de la pieza es : "+desc1);
        

       int cantidad;
       pedido1.establecerQtyArticulo(50);
       cantidad = pedido1.obtenerQtyArticulo();
       System.out.println("La cantidad del articulo es: "+cantidad); 
       
      String numPieza;
        pedido1.establecerNumDePieza( "1538456ABR52" );
        numPieza = pedido1.obtenerNumDePieza();
        System.out.println("La numero de la pieza es : "+numPieza);
    
       double virArt;
       pedido1.establecerVirArticulo(12.50);
       virArt = pedido1.obtenerVirArticulo();
       System.out.println("La valor del articulo es: "+virArt);
       
        double memVirArt;
       pedido1.establecerMemArticulo(9.37);
       memVirArt = pedido1.obtenerMemArticulo();
       System.out.println("La valor del articulo con el descuento de 25% de miembro es: "+memVirArt);
       }
}
