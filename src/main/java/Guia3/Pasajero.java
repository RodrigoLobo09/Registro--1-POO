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
public class Pasajero {
     private String nom;
   private int edad;
   
   private Info info;
   
   public Pasajero (String nom, int edad)
   {
   super();
   this.nom = nom;
   this.edad = edad;
  
   }
   
   public Info getInfo()
   {
   return info;
   }
   public void setInfo (Info info)
   {
   this.info= info;
   }
   public String getNom()
   {
   return nom;
   }
   public void setNom (String nom)
   {
   this.nom = nom;
   }
   public int getEdad()
   {
   return edad;
   }
   public void setEdad(int edad)
   {
   this.edad =edad;
   }
}
