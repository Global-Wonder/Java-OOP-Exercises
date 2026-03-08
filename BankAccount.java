public class BankAccount {
    //Private fields(encapsulation)
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Getter for balance
    public double getBalance(){
        return balance;
    }

    // Getter for accountNumber
    public String getAccountNumber(){
        return accountNumber;
    }

    // Getter for accountHolderName
    public String getAccountHolderName(){
        return accountHolderName;
    }

    // Deposit method
    public void deposit(double amount){
        if(amount > 0){
            balance = balance + amount;
            System.out.println("Deposit successful: $" + amount);
        }
        else{
            System.out.println("Error: Cannot deposit negative or zero amount");
        }

    }

    // Withdraw method
    public void withdraw(double amount){
        if (amount <= 0){
            System.out.println("Error: Withdrawal amount must be positive.");
        }
        else if (amount > balance){
            System.out.println("Error: Insufficient funds.");
        }
        else{
            balance = balance - amount;
            System.out.println("Withdrawal successsful: $" + amount);
        }

    }
}
 
class BankAccountDemo{
    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345", "John Doe", 1000.0);

        // Valid deposit
        account.deposit(500);

        // Invalid deposit
        account.deposit(-200);

        // Valid withdrawal
        account.withdraw(200);

        // Invalid withdrawal
        account.withdraw(2000);

        // Display balance
        System.out.println("Current Balance: $" + account.getBalance());
    }
}
    




