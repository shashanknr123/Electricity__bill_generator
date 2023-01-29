package com.mycompany.java_projectt;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author shash
 */
public class customer_number {

  //validation for custmoer number
    public static boolean isNumeric(String s) {
        return s != null && s.matches("[0-9]+");
    }
    public static void main(String[] args) {

        String number;
        //Input for customer number
        System.out.println("Enter the customer Number:");
        Scanner sc =new Scanner(System.in);
       
        number = sc.nextLine();
        //validating
        if (!isNumeric(number)) 
        {
            System.out.println("-----------------------Enter only Numbers(0-9)-----------------------");
        
    }else if( number.length() != 6) {
            System.out.println("-----------------------size of the customer number should be 6-----------------------");
        }
    else{
            System.out.println("-----------------------Customer number is valid :-----------------------");
    }
        }
    
}
