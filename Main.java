import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank trevorsBank = new Bank("Trevor England", 123.23);
        Bank bank2 = new Bank("Amber", 500);
        Bank bank3 = new Bank("Eric", 1000);

        System.out.println(trevorsBank.getBalance());
        System.out.println(bank2.getBalance());
        System.out.println(bank3.getBalance());

        System.out.println(trevorsBank.getBankBalance());
        squareRoot();
        // trevorsBank.accountType = AccountType.CHECKING;
        // trevorsBank.deposit(50.00);
        // trevorsBank.withdrawal(25.20);
        // double amount = trevorsBank.getBalance();
        // System.out.println(amount);

        // System.out.println(trevorsBank.getBalance());
        // System.out.println(trevorsBank.accountType);
        // System.out.println(trevorsBank.authorizedUser);

        System.out.println(Bank.convertUSDtoAUD(2));;
    }

    public static void squareRoot(){
        try{
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
       int userInput = scanner.nextInt();
       System.out.println("Square root is: " + Math.sqrt(userInput));
        } catch(InputMismatchException e){
            System.out.println("Please only enter integers.");
        }

    }
    

    
}
