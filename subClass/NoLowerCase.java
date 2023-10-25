
package assignment4;

public class NoLowerCase extends Exception
{
    public NoLowerCase(String msg) 
    {
        super("You need to have at least one lower case in your password");
    }//End constructor
}//End NoLowerCase 
