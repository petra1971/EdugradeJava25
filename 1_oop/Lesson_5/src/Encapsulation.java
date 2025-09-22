public class Encapsulation {
    public static void main(String[] args) {
        System.out.println("Inkapsling och åtkomstmodifierade");

        Car myCar = new Car();
        myCar.brand = "Volvo";

        BankAccount ba = new BankAccount();
        ba.setBalance(100);
        System.out.println("Balance is " + ba.getBalance());
        ba.withdraw(1000);
        ba.withdrawNew(1000);
        ba.withdrawNewAnd(1000);
    }
}
