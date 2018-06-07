package Tutorial3.QN1;

/**
 * Created by Guest on 6/7/18.
 */
public class OuterScopes {
    public static void main(String args[]){
        try{
            throwingExceptions();
        }catch (ExceptionB e){  // exceptions handled by the main method scope
            e.printStackTrace();
        }
    }

    public static void throwingExceptions() throws ExceptionB{
        try {
            throw new ExceptionC();
        }catch (ExceptionB e){
            e.printStackTrace();
        }
        finally {
            throw new ExceptionB();
        }
    }
}
