/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.java_projectt;

import java.util.Scanner;

//inheritance property
public class Billing extends charges {
    //static has been used for declaring varibles which has been invoked inside main function
    static double prev_con,pres_con,cons;
    
    // calling abstract methods
  double get_cost_of_energy_charge(){
      return 0;
  }
  double get_fixed_charge(){
      return 200;
  }
  
  //function for main
  void billing_main()
  {
              //final is used.
       double total_billing;
        int i=1;
        double amt=0;
       
       
        while(i==1){
             System.out.println("1.Prev Reading and present reading:");
        System.out.println("2.Total Energy consumption:");
        System.out.println("3.EXIT");
        Scanner sc=new Scanner(System.in);
        int choice = sc.nextInt();
            switch(choice){
                case 1:
                {
                    try{
                        System.out.println("Enter the previous month Reading");
                        prev_con=sc.nextDouble();
                        System.out.println("Enter the present month Reading");
                        pres_con=sc.nextDouble();
                        cons=prev_con-pres_con;
                        
                        try{
                            //trying to import gst not finished 
                            gst g=new gst(amt);
                            
                        }catch(Exception e){
                            System.out.println("Error occured while calculating the bill");
                        }
                               
                    }catch(Exception e){
                        System.out.println("error while taking input from user");
                    }
                   i=0;
                    break;
                }
                case 2:
                {
                    try{
                        
                        System.out.println("Enter Total Energy Consumption of this Month:");
                        cons=sc.nextDouble();
                        try{
                       //trying to import gst not finished 
                       gst g=new gst(amt);
                             
                            total_billing=g.calculateTotal();
                        }
                        catch(Exception e){
                            System.out.println("Error occured while calculating the bill");
                        }
                               
                    }catch(Exception e){
                        System.out.println("error while taking input from user");
                    }
                    i=0;
                    break;
                }
                 case 3:
                { 
                     i=0;
                     break;
                }
                default:
                {System.out.println("Invalid input");
                    break;
                }
                }
        }
  }
  
  
    // calculating billing ammount from consumption
    public void billingCalculate(double con) {
        
        
    }
    
    
   /* public static void main(String[] args) {
        //final is used.
       double total_billing;
        int i=1;
        double cons=0;
       gst gst1= new gst();
       
        while(i==1){
             System.out.println("1.Prev Reading and present reading:");
        System.out.println("2.Total Energy consumption:");
        System.out.println("3.EXIT");
        Scanner sc=new Scanner(System.in);
        int choice = sc.nextInt();
            switch(choice){
                case 1:
                {
                    try{
                        System.out.println("Enter the previous month Reading");
                        prev_con=sc.nextDouble();
                        System.out.println("Enter the present month Reading");
                        pres_con=sc.nextDouble();
                        
                        try{
                            //trying to import gst not finished 
                            
                            total_billing=gst1.calculate_cgst(prev_con,pres_con) + gst1.calculate_sgst(prev_con,pres_con);
                        }catch(Exception e){
                            System.out.println("Error occured while calculating the bill");
                        }
                               
                    }catch(Exception e){
                        System.out.println("error while taking input from user");
                    }
                   i=0;
                    break;
                }
                case 2:
                {
                    try{
                        
                        System.out.println("Enter Total Energy Consumption of this Month:");
                        cons=sc.nextDouble();
                        try{
                       //trying to import gst not finished 
                             
                            total_billing=gst1.calculate_cgst(cons) + gst1.calculate_sgst(cons);
                        }
                        catch(Exception e){
                            System.out.println("Error occured while calculating the bill");
                        }
                               
                    }catch(Exception e){
                        System.out.println("error while taking input from user");
                    }
                    i=0;
                    break;
                }
                 case 3:
                { 
                     i=0;
                     break;
                }
                default:
                {System.out.println("Invalid input");
                    break;
                }
                }
        }
       
    }*/

   
    }


   