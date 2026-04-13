public interface ATMOperations {
    //An interface cannot contain attributes unless they are constant.
    // Also it cannot contain constructors
    //Interfaces can only contain abstract methods
    //Abstract classes give more flexiblity while interfaces are strict
    //Interfaces only contain abstract methods but abstract classes can contain both abstract and concrete methods
    //When working with interfaces, we implement but when we're working with abstract classes, we extend.

    void withdraw(double amount);

    void deposit(double amount);

    void checkBalance();
}

class BankATM implements ATMOperations {

    private double balance;

    public BankATM(double initialBalance) {
        balance = initialBalance;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful: $" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful: $" + amount);
    }

    @Override
    public void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }
}

class ATMDemo{

    public static void main(String[] args) {

        ATMOperations atm = new BankATM(1000);

        atm.deposit(500);
        atm.withdraw(300);
        atm.checkBalance();
    }
}

