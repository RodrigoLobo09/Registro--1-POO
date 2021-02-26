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
public class Infopx {
     private String nombre;
  private  String apellidos;
  private  int edad;
  private  String diaingre;
  private String  diaegre;
  
public void establecernombre( String pnombre )
{
nombre =pnombre;
}
public String obtenerNombre()
{
return nombre;
}


public void establecerApellidos( String papellidos )
{
apellidos =papellidos;
}
public String obtenerApellidos()
{
return apellidos;
}


public void estableceredad (int pedad)
{
    edad = pedad;
}
public int obteneredad()
{
 return edad; 
}

public void establecerIngreso( String pdiaingre )
{
diaingre =pdiaingre;
}
public String obtenerIngreso()
{
return diaingre;
}


public void establecerEgreso( String pdiaegre )
{
diaegre =pdiaegre;
}
public String obtenerEngreso()
{
return diaegre;
}

}
