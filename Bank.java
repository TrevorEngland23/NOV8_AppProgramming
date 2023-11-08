/**
 * Bank
 */

 enum AccountType {CHECKING, SAVINGS};
public class Bank {
    AccountType accountType;
    private double balance;


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