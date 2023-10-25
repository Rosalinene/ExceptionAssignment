
package main;

import subClass.*;
import java.util.Scanner;


public class ExceptionClasses 
{  
    private static boolean validatePassword(String word) 
            throws PasswordTooShort, NoUpperCase, NoLowerCase, NoDigit 
    {
        if (word.length() < 8) 
        {
           throw new PasswordTooShort();
        }//End if loop PasswordTooShort
        if (!word.matches(".*[A-Z].*"))
        {
           throw new NoUpperCase();
        }//End if loop NoUpperCase
        if (!word.matches(".*[a-z].*"))
        {
            throw new NoLowerCase();
        }//End if loop NoLowerCase
        if (!word.matches(".*[0-9].*")) 
        {
            throw new NoDigit();
        }//End if loop NoDigit
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
        }//End try
        catch (PasswordTooShort | NoUpperCase | NoLowerCase | NoDigit e) 
        {
            System.out.println("Invalid Password: " + e.getMessage());
        }//End catch
        }//End while loop
    }//End main  
}//End public class Assignment4 
