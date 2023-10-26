
package main;

import exceptiontypes.*;
import java.util.Scanner;


public class ExceptionClasses 
{  
    private static boolean validatePassword(String word) 
            throws PasswordTooShort, NoUpperCase, NoLowerCase, NoDigit 
    {
        if (word.length() < 8) 
        {
           throw new PasswordTooShort("Your password is too short! You need to have at least 8 characters in your password");
        }//End if loop PasswordTooShort
        if (!word.matches(".*[0-9].*")) 
        {
            throw new NoDigit("There is no digit! You need to have at least one digit in your password");
        }//End if loop NoDigit
        if (!word.matches(".*[a-z].*"))
        {
            throw new NoLowerCase("You need to have at least one lower case in your password");
        }//End if loop NoLowerCase
        if (!word.matches(".*[A-Z].*"))
        {
           throw new NoUpperCase("You need to have at least one upper case in your password");
        }//End if loop NoUpperCase 
        return true;
    } //End validatePassword
    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String word;
        
        while (true) 
        {
            try 
            {
                System.out.print("Enter a password: ");
                word = scanner.nextLine();
                validatePassword(word);
                System.out.println("Password is valid.");
                break;
            }//End try
            catch (Exception e) 
            {
                System.out.println("Invalid Password: " + e.getMessage());
            }//End catch
            }//End while loop
            scanner.close();
    }//End main  
}//End public class Assignment4 
