public class BankAccount {
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Övertrassering");
        } else if (amount <= 0) {
            System.out.println("Ogiltigt belopp");
        } else {
            balance -= amount;
        }
        System.out.println("Balansen är " + balance);
    }

    public void withdrawNew(double amount) {
        if ((amount > balance) || (amount <= 0)) {
            System.out.println("Felaktigt belopp");
        } else {
            balance -= amount;
        }
        System.out.println("Balansen är " + balance);
    }

    public void withdrawNewAnd(double amount) {
        if ((isAmountPositive(amount)) && (hasSufficientFunds(amount))) {
            balance -= amount;
        } else {
            System.out.println("Ogiltigt belopp");
        }

    }

    private boolean isAmountPositive(double amount) {
        return (amount >= 0);
    }

    private boolean hasSufficientFunds(double amount) {
        boolean result;
        if (amount <= balance) {
            result = true;
        }
        return (balance >= amount) ;
    }

}


