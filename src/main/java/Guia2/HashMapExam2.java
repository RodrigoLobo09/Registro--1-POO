/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2;

import java.util.HashMap;

/**
 *
 * @author Lenovo
 */
public class HashMapExam2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       HashMap<Integer, String> l = new HashMap<>();
        l.put(1,  "Manzana");
        l.put(2,  "Pera");
        l.put(3,  "Naranja");
        l.put(4,  "Toronja");
        l.put(5,  "Fresa");
        l.put(6,  "Uva");
        l.put(7,  "Melon");
        l.put(8,  "Sandilla");
        l.put(9,  "Papaya");
        l.put(10, "Mango");
        l.put(11, "Cereza");
        l.put(12, "Mora");
        l.put(13, "Caz");
        l.put(14, "Banana");
        l.put(15, "Kiwi");
        l.put(16, "Ciruela");
        l.put(17, "Durazno");
        l.put(18, "Guayaba");
        l.put(19, "Piña");
        l.put(20, "Carambola");
        
        System.out.println("Las frutas disponibles son : \n"+l);
    }
    
}
