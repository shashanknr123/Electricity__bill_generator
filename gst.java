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
    double cons;
    double result_cgst;
    
 
    //calculating cgst for total
    double calculate_cgst(double cons)
    {
        //returning the result
        return 0;
    }
     double calculate_(double cons)
    {
        //returning the result
        return 0;
    }
      //calculating sgst for total
    double calculate_sgst(double cons) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //method overloading for cgst
    double calculate_cgst(double prev_con,double pres_con){
        System.out.println("test 1");
        return 0;
    }
    double calculate_sgst(double prev_con,double pres_con) {
        return 0;
    }
}
