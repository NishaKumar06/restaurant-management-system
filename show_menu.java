
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;
import java.sql.*;

public class show_menu {
   public void show_menu1(){
       try{
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login?zeroDateTimeBehavior=convertToNull","root","");
           System.out.println("-------------->>MENU LIST<<----------------");
           String query="select * from menu";
           try (Statement st = con.createStatement()) {
               ResultSet rs=st.executeQuery(query);
               System.out.println("MENUID     MENULIST       UNITPRICE");
               while(rs.next()){
                   int menuid=rs.getInt("menuid");
                   String menulist=rs.getString("menulist");
                   int unitprice=rs.getInt("unitprice");
                   
                   System.out.format("%d       %s          %d\n",menuid,menulist,unitprice);
               }
           }
           
       }
       catch(SQLException e){
           System.err.println(e);
       }
   } 
}
