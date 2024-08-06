package Interfaces;

public class Account{

    protected long account_Number;
    protected double balance;
    protected AccountType account_Type;

    public Account(long account_Number, double initialBalance, AccountType account_Type) {
        this.account_Number = account_Number;
        this.account_Type = account_Type;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public double transferAmount(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
        return balance;
    }

    public double depositeAmount(double amount){
        balance += amount;
        return balance;
    }


    public long getAccount_Number() {
        return account_Number;
    }

    public double refundAmount(double amount) {
        balance += amount;
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "account_Number=" + account_Number +
                ", balance=" + balance +
                ", account_Type=" + account_Type +
                '}';
    }
}
