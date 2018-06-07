package Tutorial2.QN2;

/**
 * Created by Guest on 5/31/18.
 */
public class BankTest {
    public static void main(String args[]){
        Bank bank = new Bank();
        bank.createAccount("asfds", "dad");
        bank.depositMoney(565);
        bank.transactionDetails("Ida2323", "3434No");
        bank.withdrawMoney(434);
    }
}
