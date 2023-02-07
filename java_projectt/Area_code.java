package com.mycompany.java_projectt;


import java.util.HashSet;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shash
 */
    public class Area_code {

    /**
     * @param args the command line arguments
     */
    // hashset to store area code values
    boolean areas(String s){
        HashSet<String> strSet = new HashSet<String>();
        strSet.add("MYSR03");
        strSet.add("MYSR02");
        strSet.add("MYSR01");
        return strSet.contains(s);
    }
    int Areacode(){
       Area_code classInstance = new Area_code();
        String area_code;
        System.out.println("Enter the Area Code(eg: MYSR00,MYSR01...):");
        Scanner sc= new Scanner(System.in);
        area_code=sc.nextLine();
        
       //size of the string
        if(area_code.length()==6){
            
        // checking for existance of area code
        if(!classInstance.areas(area_code)){
            
            System.out.println("\nCode is not valid.");
            return 0;
        
    } else {
            System.out.println("valid Area code:");
            return 1;
        }
        }else{
            System.out.println("\nArea Code should be of 6 digits.");
            return 0;
        }
        
    }
    }
