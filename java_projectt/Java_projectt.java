/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.java_projectt;

import static com.mycompany.java_projectt.Billing.cons;
import static com.mycompany.java_projectt.Billing.pres_con;
import static com.mycompany.java_projectt.Billing.prev_con;

import java.util.Scanner;

/**
 *
 * @author shash
 */
public class Java_projectt {

    public static void main(String[] args) {
        String user,pass;
        double prev=0,pres=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the user name");
        user=sc.nextLine();
        System.out.println("Enter the password:");
        pass=sc.nextLine();
        Login l=new Login(user,pass);
        if(l.check_cred()==1){
            customer_number n=new customer_number();
            if(n.CustomerNumber()==1){
                Area_code a=new Area_code();
                if(a.Areacode()==1){
                        System.out.println("area code verified");

                  //start
               double total_billing;
        int i=1;
        double amt,total;
       
       
        while(i==1){
             System.out.println("1.Prev Reading and present reading:");
        System.out.println("2.Total Energy consumption:");
        System.out.println("3.EXIT");
        int choice = sc.nextInt();
            switch(choice){
                case 1:
                {
                    try{
                        System.out.println("Enter the previous month Reading");
                        prev_con=sc.nextDouble();
                        prev=prev_con;
                        System.out.println("Enter the present month Reading");
                        pres_con=sc.nextDouble();
                        pres=prev_con;
                        cons=prev-pres;
                        
                        try{
                            //trying to import gst not finished 
                            Calculate_amt a1=new Calculate_amt(cons); 
                            total= a1.CalculateAmount();
                           
                            gst g=new gst(total);
                            amt=g.getAmount();
                            total_billing=g.calculateTotal();
                           
                            Display_Billing d=new Display_Billing(cons,n.GetCustomerNumber(),prev,pres,total,g.calculateTotal(),cons);
                            
                            d.DisplayBilling();
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
                        Calculate_amt a1=new Calculate_amt(cons);
                         total= a1.CalculateAmount();
                        
                           
                       gst g=new gst(total);
                        amt=g.getAmount();
                     
                      
                             
                            total_billing=g.calculateTotal();
                            //name,customer_number,prev,present,total,gst,cons
                            Display_Billing d=new Display_Billing(cons,n.GetCustomerNumber(),prev,pres,total,g.calculateTotal(),cons);
                           
                            d.DisplayBilling();
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
          //end
                     
     }
     }
        }
       
        }      
  
    }
}
