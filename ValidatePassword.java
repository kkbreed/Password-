/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validatepassword;

import java.util.Scanner;

/*
Create a Java application called ValidatePassword to validate a user’s password. 
Write a program that asks for a password, then asks again to confirm it. 

If the passwords don’t match or the rules are not fulfilled, prompt again. 


Your program should include a method that checks whether a password is valid. 
From that method, call a different method to validate the uppercase, lowercase, 
and digit requirements for a valid password. Your program should contain at least 
four methods in addition to the main method.

Follow these rules for a valid password:

The password must be at least 5 characters long
The password must have at least one uppercase and one lowercase letter
The password must have at least one digit
*/
public class ValidatePassword {

    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    String x;
    String y;
    String password;
    //boolean c;
    
    
        System.out.println("Enter your password ");
        x = scnr.nextLine();
        System.out.println("Confirm your password ");
        y = scnr.nextLine();
        boolean condition; */
        
       public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        //final int PASSWORD_LENGTH = 8;
           System.out.println("\n");
        getWelcome();
           System.out.println("");
           System.out.println("\n");
        String A;
        
        while(true){	
            
       
        System.out.print("Please enter password : ");
        String password = scnr.nextLine();
        System.out.print("\nPlease re-enter the password to confirm : ");
        String confirm = scnr.nextLine();
        
        boolean condition;
        condition = is_Valid_Password(password);
        getLines();
           System.out.println("\nThe password length is " + condition);
           getLines();
        
        boolean match;
        match = is_Confirm_Password(password, confirm);
           System.out.println("\nThe password match is " + match);
           getLines();
           
        boolean complex;
        complex = is_Password_Complex(password, confirm);
           System.out.println("\nThe password complexity requirements are " + complex);
           getLines();
            //System.out.println("\n");
           
	if(complex==true){

		break;
        }

	System.out.println("\nPlease enter the password again\n");

	}

	System.out.println("\nYou have successfully changed your password!\n");

 
        
               
               }
       public static boolean is_Valid_Password(String password) {

        if (password.length() <= 5) 
            return false;
        
        else return true;
          
         
     }
    
    public static boolean is_Confirm_Password(String a, String b) {
        if (a.equals(b)) return true;
        else return false;
    }
    
    public static boolean is_Password_Complex(String a, String b) {
   //String newPassword = a; 
        boolean i=false;
	 if(a.equals(b)){
	 String newPassword = a; 

   String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}";

   i=newPassword.matches(pattern);

	 }
	 return i;

	 }
    
    public static void getWelcome(){
        System.out.println("Welcome to the password program!\n");
        System.out.println("Your password must meet the following requirements:\n" +
"\n" +
"The password must be at least 5 characters long\n" +
"The password must have at least one uppercase and one lowercase letter\n" +
"The password must have at least one digit");
    }

   public static void getLines(){
        System.out.println("-----------------------------------------------------");
    }
}


    
    
