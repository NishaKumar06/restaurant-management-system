/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;
import java.sql.*;
import java.util.*;


public class show_booking {
    public void show_booking1(){
        try{
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login?zeroDateTimeBehavior=convertToNull","root","");
           System.out.println("----------------->>>ALL ORDER DETAILS<<--------------------");
           String query="select * from `order`";
           try (Statement st = con.createStatement()) {
               ResultSet rs=st.executeQuery(query);
               System.out.println("USERID --USERNAME --NUMBER --MENUID --UNITPRICE --TOTAL");
               while(rs.next()){
                   int userid=rs.getInt("userid");
                   String username=rs.getString("username");
                   int number=rs.getInt("number");
                    int menuid1=rs.getInt("menuid");
                     int unitprice=rs.getInt("unitprice");
                      int total=rs.getInt("total");
                   System.out.format("%d --    %s--      %d--       %d--        %d--     %d\n",userid,username,number,menuid1,unitprice,total);
               }
           }
           
       }
       catch(SQLException e){
           System.err.println(e);
       }
    }
}
