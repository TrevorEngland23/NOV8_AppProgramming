public class Main {
    public static void main(String[] args) {
        Bank trevorsBank = new Bank();
        trevorsBank.accountType = AccountType.CHECKING;
        trevorsBank.deposit(50.00);
        trevorsBank.withdrawal(25.20);
        double amount = trevorsBank.getBalance();
        System.out.println(amount);
    }

    
}