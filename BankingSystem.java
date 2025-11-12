class Account{
    private String accountNumber;
    private int balance;

    Account(String accountNumber, int balance){
        setaccountNumber(accountNumber);
        setbalance(balance);
    }

    public String getaccountNumber(){
        return this.accountNumber;
    }

    public int getbalance(){
        return this.balance;
    }

    public void setaccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setbalance(int balance){
        this.balance = balance;
    }

    public void deposit(int increment){
        int newbalance = this.balance + increment;
        System.out.println("You have deposited " + increment + " shillings on your account. Your new balance is " + newbalance + " shillings");
    }

    public void withdraw(int decrement){
        int newbalance = this.balance - decrement;
        System.out.println("You have withdrawn " + decrement + " shillings from your account. Your new balance is " + newbalance + " shillings");
    }
}

class SavingAccount extends Account{
    double interestRate;

    SavingAccount(String accountNumber, int balance, double interestRate){
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(int decrement){
        if ((getbalance() - decrement) < 50000){
            System.out.println("You don't have enough money to make the withdraw.");
        }
        else {
        int newbalance = getbalance() - decrement;
        System.out.println("You have withdrawn " + decrement + " shillings from your account. Your new balance is " + newbalance + " shillings");
        }
    }
    
}

public class BankingSystem {
    public static void main(String[] args){
        Account account = new Account("A001", 6000000);
        SavingAccount savingAccount = new SavingAccount("A002", 5000000, 0.08);

        account.deposit(30000);
        account.withdraw(20000);

        savingAccount.withdraw(60000);
    }
}
