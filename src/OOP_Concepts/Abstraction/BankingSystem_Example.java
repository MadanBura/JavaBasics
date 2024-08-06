package OOP_Concepts.Abstraction;

import java.util.ArrayList;
import java.util.List;

public class BankingSystem_Example {

    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount(50000100101L, 2000,5.5);
        FixedDepositAccount fixedDeposit  = new FixedDepositAccount(20000100101L, 10000, 5,5);


        savings.depositeAmount(500);
        savings.withdraw(50000100101L, 200);
        savings.getAccountType(50000100101L);
        System.out.println("Savings Account Balance: $" + savings.getBalance());
        System.out.println("Savings Account Interest: $" + savings.calculate_InterestRate());

        fixedDeposit.depositeAmount(1000);
        fixedDeposit.withdraw(20000100101L,2000); // Should not allow withdrawal as it's a fixed deposit
        fixedDeposit.getAccountType(20000100101L);
        System.out.println("Fixed Deposit Account Balance: $" + fixedDeposit.getBalance());
        System.out.println("Fixed Deposit Account Interest: $" + fixedDeposit.calculate_InterestRate());


    }

}
