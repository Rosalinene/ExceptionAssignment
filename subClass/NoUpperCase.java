
package subClass;

public class NoUpperCase extends Exception
{
    public NoUpperCase(/*String msg*/) 
    {
        super("You need to have at least one upper case in your password");
    }//End constructor
}//End public class NoUpperCase 
