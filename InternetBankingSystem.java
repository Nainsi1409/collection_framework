class Account {
    private double balance = 0;
    public Account(double balance) {
        this.balance = balance;
    }
    // if ‘synchronized’ is removed, the outcome is unpredictable
    public synchronized void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Can’t deposit.");
        }
        this.balance += amount;
        System.out.println("Deposit "+amount+" in thread" +Thread.currentThread().getId() +", balance is " +balance);
    }
    // if ‘synchronized’ is removed, the outcome is unpredictable
    public synchronized void withdraw(double amount) {
        if (amount < 0 || amount > this.balance) {
            throw new IllegalArgumentException("Can’t withdraw.");
        }
        this.balance -= amount;
        System.out.println("Withdraw "+amount+" in thread " + Thread.currentThread().getId() + ", balance is "+balance);
    }
}//end Account clas
class WithdrawThread implements Runnable {
    private Account account;
    private double amount;
    public WithdrawThread(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }
    public void run() {
        //make a withdraw
        account.withdraw(amount);
    }
}//end WithdrawThread class
/* DepositThread.java A thread that deposit a given amount to a given
account. */
class DepositThread implements Runnable {
    private Account account;
    private double amount;
    public DepositThread(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }
    public void run() {
        //make a deposit
        account.deposit(amount);
    }
}//end DepositThread class
public class InternetBankingSystem {
        public static void main(String [] args ) {
            Account accountObject = new Account(100);
            new Thread(new DepositThread(accountObject, 30)).start();
            new Thread(new DepositThread(accountObject, 20)).start();
            new Thread(new DepositThread(accountObject, 10)).start();
            new Thread(new WithdrawThread(accountObject, 30)).start();
            new Thread(new WithdrawThread(accountObject,50)).start();
            new Thread(new WithdrawThread(accountObject,20)).start();
        } // end main()
}
