
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;
import java.util.*;

public class rmsmain {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("----------------------------WELCOME TO RESTAURANT MANAGEMENT SYSTEM---------------------");
        int n,p;
        do{
            System.out.println("enter your option---->>"+"\n"
                    + "   1.LOGIN/SIGNUP"+"\n"
                    + "   2.ABOUT"+"\n"
                    +"    3.SHOW MENU"+"\n"
                    +"    4.PLACE ORDER"+"\n"
                    +"    5.SHOW-BOOKING-DETAILS"+"\n"
                    +"    6.CANCEL BOOKING"+"\n"
                    +"     7.ADMIN LOGIN"+"\n"
                    +"      8.MENUCATEGORY"+"\n"
                     +"   9.EXIT");
             n=sc.nextInt();
            switch(n){
                case 1:
                    login ab=new login();
                    ab.login1();
                    break;
                case 2:
                    intro a=new intro();
                    a.intro1();
                    break;
                case 3:
                    show_menu b=new show_menu();
                    b.show_menu1();
                    break;
                case 4:
                    book_table c=new book_table();
                    c.book_table1();
                    break;
                case 5:
                    show_booking d=new show_booking();
                    d.show_booking1();
                    break;
                case 6:
                    cancel_booking e=new cancel_booking();
                    e.cancel_booking1();
                    break;
                case 7:
                    admin f=new admin();
                    f.admin1();
                    break;
                case 8:
                    menucategory g=new menucategory();
                    g.menucategory1();
                    break;
                case 9:
                    return;
                    
                    
            }
            System.out.println("\n");
              System.out.println("---->>PRESS 1 TO GO BACK TO MAIN MENU<<------");   
              p=sc.nextInt();
        }while(p==1);
    }
}

