
package login;
import java.util.*;
import java.sql.*;

public class login {
  public  void login1(){
      
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login?zeroDateTimeBehavior=convertToNull","root","");
         //Statement stmt=con.createStatement(); 
         int a;
        do{
         System.out.println("1.Signup" +"\n"+"2.Login"+"\n"+ "3.backtomainmenu");
          Scanner sc=new Scanner(System.in);
         int opt;
            opt = sc.nextInt();
         switch(opt){
            case 1:{      
      
         System.out.println("enter  userid, username and password");
         int id=sc.nextInt();
         String username=sc.nextLine();
         String password=sc.nextLine();
       PreparedStatement prestmt=con.prepareStatement("insert into userinfo values(?,?,?)");
       prestmt.setInt(1,id);  
       prestmt.setString(2,username);
         prestmt.setString(3,password);
         prestmt.executeUpdate();
System.out.println(username+" you are signed up");
break;
        }
        case 2:{
         System.out.println("enter userid,username and password");
        int id=sc.nextInt();
         String username=sc.nextLine();
         String password=sc.nextLine();
         PreparedStatement prestmt=con.prepareStatement("select userid,username,password from userinfo where username=? and password=?");
         prestmt.setString(1,username);
         prestmt.setString(2,password);      
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
        }
        case 3:
            return;
            
        }
         System.out.println("\n");
         System.out.println("to go back --->>press 1");
         a=sc.nextInt();
       }while(a==1);
        }
        catch(SQLException e){
            System.out.println("not connected");
        }
    }
    
}
