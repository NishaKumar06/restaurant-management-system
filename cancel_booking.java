/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;
import java.sql.*;
import java.util.*;
/**
 *
 * @author User
 */
public class cancel_booking {
    public void cancel_booking1(){
        try{
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login?zeroDateTimeBehavior=convertToNull","root","");
              System.out.println("----DO YOU WANT TO CANCEL YOUR BOOKING-??---");
              Scanner sc=new Scanner(System.in);
              System.out.println("enter  your userid");
              int a=sc.nextInt();
              PreparedStatement prestmt=con.prepareStatement("delete from `order` where userid=?");
              prestmt.setInt(1, a);
              prestmt.executeUpdate();
              System.out.println("your booking is cancelled");
              System.out.println("----------------THANK YOU--------------");
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }
}
