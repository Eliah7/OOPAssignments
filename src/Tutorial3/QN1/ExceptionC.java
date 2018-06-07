package Tutorial3.QN1;

/**
 * Created by Guest on 6/7/18.
 */
public class ExceptionC extends ExceptionB {
    @Override
    public void printStackTrace() {
        super.printStackTrace();
        System.out.println("This program throws an ExceptionC exception");

    }
}
