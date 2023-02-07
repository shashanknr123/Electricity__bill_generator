/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_projectt;

/**
 *
 * @author shash
 */
//implemented interface named login_cred
public class Login implements login_cred{
    String user;
    String pass;
    Login(String u,String p){
        this.user=u;
        this.pass=p;
    }
    public int check_cred(){
        if(this.user.equals(user_name) && this.pass.equals(password))
        {
            System.out.println("Logged in");
            return 1;
        }
        else{
            System.out.println("invalid credentials");
        return 0;
        }
    }
    
}
