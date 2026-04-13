public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance = balance + amount;
            System.out.println("Deposit successful: $" + amount);
        }
        else{
            System.out.println("Error: Cannot deposit negative or zero amount");
        }

    }

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

        account.deposit(500);

        account.deposit(-200);

        account.withdraw(200);

        account.withdraw(2000);

        System.out.println("Current Balance: $" + account.getBalance());
    }
}
    




