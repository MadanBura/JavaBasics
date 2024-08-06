package OOP_Concepts.Abstraction;

    public abstract class BankAccount  {

        protected long account_Number;
        protected double balance;
        protected Account account_Type;

        public BankAccount(long account_Number, double initialBalance, Account account_Type) {
            this.account_Number = account_Number;
            this.account_Type = account_Type;
            if (initialBalance >= 0) {
                this.balance = initialBalance;
            } else {
                this.balance = 0;
                System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            }
        }

        //Abstract Method --> for Interest rate
        abstract double calculate_InterestRate();

        //Concrete Method -->
        public void depositeAmount(double amount){
            if (amount > 0){
                balance +=amount;
                System.out.println("Deposited $" + amount + " into account " + account_Number);
            }else{
                System.out.println("Amount Should be greater than zero >> ");
            }
        }

        // Public method to get the account type
        public Account getAccountType(long accountNumber) {
            if (this.account_Number == accountNumber) {
                return this.account_Type;
            } else {
                System.out.println("Account number: " + accountNumber + " is incorrect.");
                return null;
            }
        }

        // Public method to set the account type
        public void setAccountType(Account accountType) {
            this.account_Type = accountType;
        }


        public void withdraw(long account_Number,double amount) {

            Account type = getAccountType(account_Number);

            if (type == null) {
                System.out.println("Account number is invalid.");
                return;
            }

            switch (type) {
                case Account.SAVINGS:
                    if (balance >= amount) {
                        balance -= amount;
                        System.out.println("Withdrew $" + amount + " from account " + account_Number);
                    } else {
                        System.out.println("Insufficient funds in account " + account_Number);
                    }
                    break;

                case Account.FIXED_DEPOSITE:
                    System.out.println("Can't withdraw from Fixed Deposit Account.");
                    break;

                default:
                    System.out.println("Unsupported account type.");
                    break;
            }
        }

        public double getBalance() {
            return balance;
        }

        public long getAccountNumber() {
            return account_Number;
        }
    }

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(long account_Number, double balance, double interestRate) {
        super(account_Number, balance, Account.SAVINGS);
        this.interestRate = interestRate;
    }

    @Override
    double calculate_InterestRate() {
        return balance * interestRate / 100;
    }
}


class FixedDepositAccount extends BankAccount {
    private double interestRate;
    private int duration; // in months

    public FixedDepositAccount(long accountNumber, double balance, double interestRate, int duration) {
        super(accountNumber, balance, Account.FIXED_DEPOSITE);
        this.interestRate = interestRate;
        this.duration = duration;
    }
    @Override
    double calculate_InterestRate() {
        return balance * interestRate / 100 * duration / 12;
    }

}
