/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3;

import com.sun.javafx.scene.traversal.Direction;

/**
 *
 * @author Lenovo
 */
public class Empresa {
    private String cif;
    private Direccion dirección;
    
    public Direccion getDirección()
    {
    return dirección;
    }
    public void setDirección(Direccion dirección)
    {
    this.dirección = dirección;
    }
      public String getCif()
    {
    return cif;
    }
    public void setCif(String cif)
    {
    this.cif = cif;
    }
}
