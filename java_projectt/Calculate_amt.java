/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_projectt;

/**
 *
 * @author shash
 */
public class Calculate_amt {
    double cons;
    final double amount=4.1;
    double Total_amount;
    Calculate_amt(double cons){
        this.cons=cons;
    }
    // To get amount value 
   
    public double CalculateAmount(){
        Total_amount=this.cons*this.amount;
        //minmum total amount 
        if(Total_amount<=100){
            return 100;
        }
        else{
        return this.cons*this.amount;
        }
        
    }
    
}
//called by billing.java
