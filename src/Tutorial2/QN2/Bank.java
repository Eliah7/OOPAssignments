package Tutorial2.QN2;

/**
 * Created by Guest on 5/31/18.
 */
public class Bank implements BankAccount, Transaction {
    private String accNo;
    private String accName;
    private String transactionID;
    private String transactionNo;
    private long transactionTime;
    private int balance;

    @Override
    public void createAccount(String accNo, String accName) {
        this.accNo = accNo;
        this.accName = accName;
    }

    @Override
    public void depositMoney(int amount) {
        if (amount > 0)
            balance = this.balance + amount;
        display(amount);
    }

    @Override
    public void withdrawMoney(int amount) {
        if (amount > 0)
            balance = this.balance - amount;
        display(amount);
    }

    @Override
    public void transactionDetails(String transctionId, String transactionNo) {
        this.transactionID = transctionId;
        this.transactionNo = transactionNo;
        this.transactionTime = System.currentTimeMillis();
    }

    public void display(int amount){
        System.out.println("The balance is $" + this.balance + " and the amount entered was $"+ amount);
    }
}
