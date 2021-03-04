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
public class Info {

    private String email;
    private int tel;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    
    }
    public Info (String email, int tel) 
    {
        super();
        this.email = email;
        this.tel = tel;

    }
}
