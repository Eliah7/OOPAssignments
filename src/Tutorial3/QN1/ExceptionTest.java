package Tutorial3.QN1;

import java.io.IOException;

/**
 * Created by Guest on 6/7/18.
 */
public class ExceptionTest {
    public static void main(String args[]){
        // ExceptionA Block
        try{
            throw new ExceptionA();
        }catch (Exception exception){
            exception.printStackTrace();
            System.out.println();
        }

        // ExceptionB Block
        try{
            throw new ExceptionB();
        }catch (Exception exception){
            exception.printStackTrace();
            System.out.println();
        }

        // NullPointerException Block
        try{
            throw new NullPointerException();
        }catch (Exception exception){
            exception.printStackTrace();
            System.out.println();
        }

        // IOException Block
        try{
            throw new IOException();
        }catch (Exception exception){
            exception.printStackTrace();
            System.out.println();
        }
    }
}
