package Tutorial2.QN2;

/**
 * Created by Guest on 5/31/18.
 */
public interface BankAccount {
    void createAccount(String accNo, String accName);
    void depositMoney( int amount);
    void withdrawMoney( int amount);
}
