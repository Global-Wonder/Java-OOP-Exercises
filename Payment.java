public abstract class Payment {
    
    public abstract void processPayment(double amount);
}


class CreditCardPayment extends Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

class MobileMoneyPayment extends Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing mobile money payment of $" + amount);
    }
}

class BankTransferPayment extends Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing bank transfer payment of $" + amount);
    }
}

class PaymentDemo {

    public static void main(String[] args) {

        Payment[] payments = {
            new CreditCardPayment(),
            new MobileMoneyPayment(),
            new BankTransferPayment()
        };

        for (Payment p : payments) {
            p.processPayment(500.0);
        }
    }
}