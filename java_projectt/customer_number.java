package com.mycompany.java_projectt;


import static com.mycompany.java_projectt.Billing.cons;
import static com.mycompany.java_projectt.Billing.pres_con;
import static com.mycompany.java_projectt.Billing.prev_con;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shash
 */
public class customer_number {
    String number;
    //validation for custmoer number
    customer_number(){
        
    }
    public static boolean isNumeric(String s) {
        return s != null && s.matches("[0-9]+");
        
    }
    
    String GetCustomerNumber(){
        return this.number;
    }
    int CustomerNumber(){
          
        //Input for customer number
        System.out.println("Enter the customer Number:");
        Scanner sc =new Scanner(System.in);
       int r=0;
        number = sc.nextLine();
        //validating
        if (!isNumeric(number)) 
        {
            System.out.println("-----------------------Enter only Numbers(0-9)-----------------------");
            r=0;
        
    }else if( number.length() != 6) {
            System.out.println("-----------------------size of the customer number should be 6-----------------------");
            r=0; 
            
            
        }
    else{
            System.out.println("-----------------------Customer number is valid :-----------------------");
          
              return 1;
            }
            
    
        return r;
    

}
}
