class Account {
    private int id;

    // Parameter and instance variable have the same name "id"
    Account (int id) {
        // Use 'this' to refer to the instance variable
        this.id = id;
    } 
    // Method to get the account ID
    public int getId()
{
        return this.id;
}
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        Account acc = new Account(2001);
        System.out.println("Account ID: " + acc.getId()); // Output: Account ID: 12345
    }
    
}
