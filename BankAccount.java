public class BankAccount {
    //Private variables(encapsulation)
    private String accountNumber;
    private double balance;

    //Getter for balance
    public double getBalance(){
        return balance;
    }

    // Getter for accountNumber
    public String getaccountNUmber(){
        return accountNumber;
    }

    public void deposit(double amount){
        balance = balance + amount;

    }

    public void withdraw(double amount){
        if(amount <= balance){
            balance = balance - amount;
        }
        else{
            System.out.println("Insufficient funds");
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(500);
        account.withdraw(200);

        System.out.println("Balance: $" + account.getBalance());
    }


    
    

}
