/**
 * Bank
 */

 enum AccountType {CHECKING, SAVINGS};
public class Bank {

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
    }


    public double getBalance(){
        return balance;
    }

    // deposit method
    public double deposit(double value){
        balance += value;
        return balance;
    }

    // withdrawl method
    public double withdrawal(double value){
        return balance -= value;
    }


}