package quiz02;

public class BankAccountMain {
    public static void main(String[] args) {
    BankAccount account = new BankAccount("1234", 10000);

    account.deposit(1000);
    account.withdraw(500);
    double result = account.getBalance();
        System.out.println("잔액" + result);
    }
}
