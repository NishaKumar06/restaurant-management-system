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
public class admin {
    public void admin1(){
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login?zeroDateTimeBehavior=convertToNull","root","");
        Scanner sc=new Scanner(System.in);
        int o;
        do{
         System.out.println("1.Signup" +"\n"+"2.Login"+"\n"+ "3.back to main menu");
          
         int opt;
            opt = sc.nextInt();
         switch(opt){
            case 1:{     
        System.out.println("enter your adminid");
        int id=sc.nextInt();
        System.out.println("Enter adminname ");
        String a=sc.next();
        System.out.println("enter your password");
        String b=sc.next();
        PreparedStatement prestmt=con.prepareStatement("insert into admin values(?,?,?)");
       prestmt.setInt(1,id);  
       prestmt.setString(2,a);
         prestmt.setString(3,b);
         prestmt.executeUpdate();
        System.out.println(a+" you are logged in successfully");
        break;
            }
            case 2:
                System.out.println("enter adminid,adminname and password");
        int adminid=sc.nextInt();
         String username=sc.nextLine();
         String password=sc.nextLine();
         PreparedStatement prestmt=con.prepareStatement("select adminid,adminname,password from admin where adminid=?");
         prestmt.setInt(1,adminid);
        // prestmt.setString(2,password);      
         ResultSet rs=prestmt.executeQuery();
         if(rs.next())
         {        
        System.out.println("welcome"+username );
        System.out.println("you are logged in");
        }
        else{
        System.out.println("please signup or enter valid id");
        }
          break;
        
        case 3:
            return;
            
        }
         System.out.println("\n");
         System.out.println("to go back --->>press 1");
         o=sc.nextInt();
        }while(o==1);
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }
}
