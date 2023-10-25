
package assignment4;

import static assignment4.ValidatePassword.validatePassword;
import java.util.Scanner;


public class ExceptionClasses 
{  
    private static boolean validatePassword(String word) throws PasswordTooShort, NoUpperCase, NoLowerCase, NoDigit 
    {
        if (word.length() < 8) 
        {
           return false;
        }
        else 
        {
            for (int i = 0; i < word.length(); i++) 
            {
                if (Character.NoUpperCase(word.charAt(i))) 
                {
                    throw new NoUpperCase();
                }
            }
        }
    } //End validatePassword
    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String word;
        
        //while (true) 
        //{
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
        //}//End while loop
        scanner.close();
    }//End main  
}//End public class Assignment4 
