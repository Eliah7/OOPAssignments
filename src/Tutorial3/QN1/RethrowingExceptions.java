package Tutorial3.QN1;

/**
 * Created by Guest on 6/7/18.
 */
public class RethrowingExceptions {

    public static void main(String args[]){
        try {
            Meth1();
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void Meth2() throws Exception {
        throw new Exception();
    }

    public static void Meth1() throws Exception{
        try{
            Meth2();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            throw new Exception();
        }
    }

}
