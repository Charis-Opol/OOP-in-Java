// Create a class BankAccount with attributes accountNumber and balance. 
class BankAccount {
    String accountNumber;
    double balance;

    // Constructor to initialize BankAccount object
    BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;

        System.out.println("You have created a bank account " + accountNumber + " with an intial deposit of " + balance);
    }

    // Method to deposit money into the account
    public void deposit(double amount){
        this.balance = this.balance + amount;
        System.out.println("You have deposited " + amount + " UGX. The new account balance is " + this.balance + "UGX.");
    }
    // Method to withdraw money from the account
    public void withdraw(double amount){
        if (this.balance < amount){
            System.out.println("You don't have enough money to complete this transaction.");
        } else {
            this.balance = this.balance - amount;
            System.out.println("You have withdrawn " + amount + " UGX. The new account balance is " + this.balance + "UGX.");
    }
}

public class Question6 {
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount Account1 = new BankAccount("B101", 1000000);
        // Performing deposit and withdrawal operations
        Account1.withdraw(20000);
        Account1.deposit(40000);
    }
    
}
}
