
package assignment4;

public class NoDigit extends Exception
{
    String msg;
    public NoDigit(String msg) 
    {
        super("There is no digit! You need to have at least 8 digits in your password");
    }//End constructor
    
    
}//End NoDigit
