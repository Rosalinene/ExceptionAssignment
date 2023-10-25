
package assignment4;

public class PasswordTooShort extends Exception
{
    public PasswordTooShort(String msg) 
    {
        super("Your password is too short! You need to have at least 8 digits in your password");
    }//End constructor 
}//End public class PasswordTooShort 
