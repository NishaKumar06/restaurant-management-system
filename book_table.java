/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;
import java.sql.*;
import java.util.*;

public class book_table {
    public void book_table1(){
       try{
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login?zeroDateTimeBehavior=convertToNull","root","");
           Scanner sc=new Scanner(System.in);
           System.out.println("enter your userid");
           int a = sc.nextInt();
           System.out.println("enter your username");
           String b=sc.next();
           System.out.println("enter the number of members");
           int c=sc.nextInt();
           System.out.println("enter the menuid you chose");
           int f=sc.nextInt();
           System.out.println("enter your date");
           String date=sc.next();
           PreparedStatement prestmt=con.prepareStatement("select unitprice from `menu` where menuid=?");
          prestmt.setInt(1, f);
       int g=0;
           ResultSet rs = prestmt.executeQuery();
           while(rs.next()){
                g=rs.getInt("unitprice");
           }
        prestmt=con.prepareStatement("insert into `order` values(?,?,?,?,?,?,?)");
       prestmt.setInt(1, a);
       prestmt.setString(2, b);
        prestmt.setInt(3, c);
           prestmt.setInt(4, f);
            prestmt.setInt(5, g);
             prestmt.setInt(6,c*g );
             prestmt.setString(7, date);
           prestmt.executeUpdate();
           System.out.println("\n");
           System.out.println("---->>>"+b+" your order is booked");
          System.out.println("\n");
           System.out.println("--------->>>YOUR  BOOKING  DETAILS<<-----------");
                 prestmt=con.prepareStatement("select * from `order` where userid=?");
           prestmt.setInt(1,a);
         //  prestmt.setTimestamp(1, x);
                rs=prestmt.executeQuery();
                System.out.println("USERID --USERNAME --NUMBER --MENUID --UNITPRICE --TOTAL  ---DATE");
               while(rs.next()){
                   int userid=rs.getInt("userid");
                    String username=rs.getString("username");
                   int number=rs.getInt("number");
                    int menuid1=rs.getInt("menuid");
                     int unitprice=rs.getInt("unitprice");
                      int total=rs.getInt("total");
                     
               date = rs.getDate("date").toString();
               
                   System.out.format("%d --    %s --     %d --     %d --      %d --      %d    --%s\n",userid,username,number,menuid1,unitprice,total,date);
               }
           
           
       }
       
           
 
       catch(SQLException e){
           System.err.println(e);
       }
    }
    
}
