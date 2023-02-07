/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_projectt;

/**
 *
 *  This class contains method overloading
 *  and has been inherited by the billing class
 * 
 */
class gst {
   
    private double amount;
    private static double GST = 18;
    gst(double amount) {
        this.amount = amount;
    }
    
    
    public double getAmount() {
        return this.amount;
    }
    
    public double calculateTotal() {
        return amount + ((amount * GST)/100) ;
    }
}

//flow follows from billing
