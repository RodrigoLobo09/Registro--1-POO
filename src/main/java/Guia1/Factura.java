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
public class Factura {
  private String numDePieza;
  private  String descPieza;
  private  int cantArticulo;
  private  double priceArticulo;
  private double  memArticulo;
    

public void establecerNumDePieza( String pNumDePieza )
{
numDePieza =pNumDePieza;
}
public String obtenerNumDePieza()
{
return numDePieza;
}
public  void establecerDescPieza (String pDescPieza)
{
descPieza= pDescPieza;
}
public String obtenerDescPieza()
{
    return descPieza;
}        
public void establecerQtyArticulo (int pQtyArticulo)
{
    cantArticulo = pQtyArticulo;
}
public int obtenerQtyArticulo()
{
 return cantArticulo;   
}
public void establecerVirArticulo(double pVirArticulo)
{
    priceArticulo = pVirArticulo;
}
public double obtenerVirArticulo()
{
    return priceArticulo;
}
public void establecerMemArticulo (double descMemArticulo)
{
    memArticulo = descMemArticulo;
}
public double obtenerMemArticulo()
{
 return memArticulo;   
}
}