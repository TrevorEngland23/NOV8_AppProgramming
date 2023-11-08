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