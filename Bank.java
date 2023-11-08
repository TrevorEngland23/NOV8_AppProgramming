/**
 * Bank
 */
// when you use static it is a global method/variable. without static its considered an instance  method.

 enum AccountType {CHECKING, SAVINGS};
public class Bank {

    final String routingNumber = "8949249sosdjonODNF1";
    // tracks overall balance stored at the bank.
    private static double bankBalance; // static to make it a global variable. without static its an instance variable 
    AccountType accountType;
    private double balance;
    String authorizedUser;

    public Bank() { // constructor that matches name of the class.
        super();
        accountType = AccountType.CHECKING;
        authorizedUser = "";
    }

    public Bank(String authorizedUser){
        this.accountType = AccountType.CHECKING;
        this.authorizedUser = authorizedUser;
    }

    public Bank(String authorizedUser, double balance){
        this.balance = balance;
        this.authorizedUser = authorizedUser;
        this.accountType = AccountType.CHECKING;
        bankBalance += balance;
    }


    public double getBalance(){
        return balance;
    }

    public static double getBankBalance(){
        return bankBalance;
    }

    // deposit method
    public double deposit(double value){
        bankBalance += value;
        balance += value;
        return balance;
    }

    // withdrawl method
    public double withdrawal(double value){
        bankBalance -= value;
        return balance -= value;
    }

    // create a static method for currency conversion (USD -> AUD)

    public static double convertUSDtoAUD(double usd){
        return usd * 1.56;
    }

}