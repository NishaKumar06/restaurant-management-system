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
public class menucategory {
    public void menucategory1(){
        Scanner sc=new Scanner(System.in);
        int n,p;
        System.out.println("----->>MENU CATEGORY<<------");
        do{
            System.out.println("--->>ENTER YOUR OPTION TO CHOOSE A CATEGORY<<------");
            System.out.println("1.STARTERS"+"\n"+"2.MEALS"+"\n"+"3.BIRYANI"+"\n"+"4.DESSERTS"+"5.EXIT");
            p=sc.nextInt();
            switch(p){
                case 1: {
                   try{
                       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login?zeroDateTimeBehavior=convertToNull","root","");
                       System.out.println("you can enter new items");
                       System.out.println("enter the item id");
                       int id=sc.nextInt();
                       System.out.println("enter the item name");
                       String name=sc.next();
                       System.out.println("enter the item price");
                       int price=sc.nextInt();
                       PreparedStatement stmt=con.prepareStatement("insert into starters values (?,?,?)");
                       stmt.setInt(1, id);
                        stmt.setString(2, name);
                         stmt.setInt(3, price);
                       stmt.executeUpdate();
                       System.out.println(name+" ==>> item is successfully added");
                       System.out.println("-------------->>MENU LIST<<----------------");
           
            stmt = con.prepareStatement("select * from starters");
               ResultSet rs=stmt.executeQuery();
               System.out.println("ID     NAME       PRICE");
               while(rs.next()){
                    id=rs.getInt("id");
                   name=rs.getString("name");
                   price=rs.getInt("price");
                   
                   System.out.format("%d       %s          %d\n",id,name,price);
               }
           

                   }
                   catch(SQLException e){
                       System.err.println(e);
                   }
                break;
                }
                case 2:
                {
                    
                   try{
                       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login?zeroDateTimeBehavior=convertToNull","root","");
                       System.out.println("you can enter new items");
                       System.out.println("enter the item id");
                       int id=sc.nextInt();
                       System.out.println("enter the item name");
                       String name=sc.next();
                       System.out.println("enter the item price");
                       int price=sc.nextInt();
                       PreparedStatement stmt=con.prepareStatement("insert into meals values (?,?,?)");
                       stmt.setInt(1, id);
                        stmt.setString(2, name);
                         stmt.setInt(3, price);
                       stmt.executeUpdate();
                       System.out.println(name+" ==>> item is successfully added");
                       System.out.println("-------------->>MENU LIST<<----------------");
           
            stmt = con.prepareStatement("select * from meals");
               ResultSet rs=stmt.executeQuery();
               System.out.println("ID     NAME       PRICE");
               while(rs.next()){
                    id=rs.getInt("id");
                   name=rs.getString("name");
                   price=rs.getInt("price");
                   
                   System.out.format("%d       %s          %d\n",id,name,price);
               }
           

                   }
                   catch(SQLException e){
                       System.err.println(e);
                   }
                break;
                }
                case 3: {
                   try{
                       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login?zeroDateTimeBehavior=convertToNull","root","");
                       System.out.println("you can enter new items");
                       System.out.println("enter the item id");
                       int id=sc.nextInt();
                       System.out.println("enter the item name");
                       String name=sc.next();
                       System.out.println("enter the item price");
                       int price=sc.nextInt();
                       PreparedStatement stmt=con.prepareStatement("insert into biryani values (?,?,?)");
                       stmt.setInt(1, id);
                        stmt.setString(2, name);
                         stmt.setInt(3, price);
                       stmt.executeUpdate();
                       System.out.println(name+" ==>> item is successfully added");
                       System.out.println("-------------->>MENU LIST<<----------------");
           
            stmt = con.prepareStatement("select * from biryani");
               ResultSet rs=stmt.executeQuery();
               System.out.println("ID     NAME       PRICE");
               while(rs.next()){
                    id=rs.getInt("id");
                   name=rs.getString("name");
                   price=rs.getInt("price");
                   
                   System.out.format("%d       %s          %d\n",id,name,price);
               }
           

                   }
                   catch(SQLException e){
                       System.err.println(e);
                   }
                break;
                }
                case 4: {
                   try{
                       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login?zeroDateTimeBehavior=convertToNull","root","");
                       System.out.println("you can enter new items");
                       System.out.println("enter the item id");
                       int id=sc.nextInt();
                       System.out.println("enter the item name");
                       String name=sc.next();
                       System.out.println("enter the item price");
                       int price=sc.nextInt();
                       PreparedStatement stmt=con.prepareStatement("insert into desserts values (?,?,?)");
                       stmt.setInt(1, id);
                        stmt.setString(2, name);
                         stmt.setInt(3, price);
                       stmt.executeUpdate();
                       System.out.println(name+" ==>> item is successfully added");
                       System.out.println("-------------->>MENU LIST<<----------------");
           
            stmt = con.prepareStatement("select * from desserts");
               ResultSet rs=stmt.executeQuery();
               System.out.println("ID     NAME       PRICE");
               while(rs.next()){
                    id=rs.getInt("id");
                   name=rs.getString("name");
                   price=rs.getInt("price");
                   
                   System.out.format("%d       %s          %d\n",id,name,price);
               }
           

                   }
                   catch(SQLException e){
                       System.err.println(e);
                   }
                break;
                }
                case 5:
                    return;
                }
            
            System.out.println("press 1 to go back");
            n=sc.nextInt();
    }while(n==1);
    }
}
