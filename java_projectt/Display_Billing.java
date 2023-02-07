/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_projectt;

import static com.mycompany.java_projectt.Billing.cons;
import static com.mycompany.java_projectt.Billing.pres_con;
import static com.mycompany.java_projectt.Billing.prev_con;
import java.util.*;
import java.sql.*;

/**
 *
 * @author shash
 */
public class Display_Billing {
           double s1;
           String customer_s;
           String name=null;
           double prev,pres,total_cons;
           double amount,gst_amt;
           //name,customer_number,prev,present,total,gst
      Display_Billing(double s,String customer,double prev,double pres,double total,double aftgst,double cons)
       {
       this.s1=s;
       this.customer_s=customer;
       this.total_cons=cons;
       this.amount=total;
       this.pres=pres;
       this.prev=prev;
       this.gst_amt=aftgst;
       
   }
    //Database connection
   int connection(){

     
       int customer_no;
       customer_number n= new customer_number();
     
       
try{
    Class.forName("com.mysql.cj.jdbc.Driver"); 
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
          String ss="select name from java_con where customer_no"+this.customer_s;
           Statement stmt=con.createStatement();
           ResultSet rs=stmt.executeQuery(ss);  
    while(rs.next())  

       
    System.out.println(rs.getString(1));  
            name=rs.getString(1);
    con.close();  
    return 1;
   
}catch(Exception e){
            System.out.println(e);
            return 0;
}
      



}
     void DisplayBilling(){
          System.out.println(" ........Electricity Billing..........");
          System.out.println("previous reading of bill:"+prev_con);
          System.out.println("present reading of bill:"+pres_con);
          System.out.println("Total Electricity of this month (Kwh):"+this.total_cons);
          System.out.println("Total Amount:"+this.amount);
          System.out.println("After gst amount="+this.gst_amt);
          
          
      }
}
