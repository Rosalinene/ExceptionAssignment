
package subClass;

public class NoDigit extends Exception
{
    public NoDigit(/*PasswordTooShort*/) 
    {
        super("There is no digit! You need to have at least 8 digits in your password");
    }//End constructor 
}//End NoDigit
