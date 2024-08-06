package Interfaces;

import java.util.*;

public class PaymentService {

    static List<Account> accountList = new ArrayList<>();
    static Map<Long, Long> transactionId_List = new HashMap<>();

    public static void main(String[] args) {

        Account a1 = new Account(100020301L, 5000, AccountType.SAVINGS);
        Account a2 = new Account(100020302L, 5000, AccountType.SAVINGS);
        Account a3 = new Account(100020303L, 5000, AccountType.SAVINGS);
        Account a4 = new Account(100020304L, 5000, AccountType.SAVINGS);
        Account a5 = new Account(100020305L, 5000, AccountType.SAVINGS);

        Collections.addAll(accountList, a1, a2, a3, a4, a5);

        Payment paypal = new PayPal();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter amount to be transferred >> ");
        int amountPayPal = sc.nextInt();
        System.out.println("Please enter Your Bank Account Number >> ");
        long accNo = sc.nextLong();
        System.out.println("Please enter Bank Account Number of Consignee >> ");
        long accNo1 = sc.nextLong();

        // Find the account based on account number
        Account account = findAccountByNumber(accNo);
        Account account1 = findAccountByNumber(accNo1);

        if (account != null && account1 != null) {
            if (account.getBalance() >= amountPayPal) {
                try {
                    double currentBal = account1.getBalance();

                    long transactionId = paypal.processPayment(amountPayPal, account.getAccount_Number(), account1.getAccount_Number());
                    double currentBalance = account.transferAmount(amountPayPal);
                    double newBalance = account1.depositeAmount(amountPayPal);
                    Thread.sleep(3000);
                    System.out.println("Current Balance is >> " + currentBalance);
                    System.out.println("Save this transaction Id for Ref : " + transactionId);
                    transactionId_List.put(account.getAccount_Number(), transactionId);

                    System.out.println();
                    if(newBalance>currentBal){
                        System.out.println(account1);
                    }


                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println("Insufficient balance in the account.");
            }
        } else {
            System.out.println("Account number not found.");
        }
    }

    private static void refundPayment(Payment payment, long transactionId) {
        Long accountNumber = transactionId_List.get(transactionId);
        if (accountNumber != null) {
            Account account = findAccountByNumber(accountNumber);
            if (account != null) {
                double refundedAmount = payment.processPayment(transactionId, account.getAccount_Number(), account.getAccount_Number());
                double newBalance = account.refundAmount(refundedAmount);
                System.out.println("Refunded amount: " + refundedAmount);
                System.out.println("New balance: " + newBalance);
                transactionId_List.remove(transactionId);
            } else {
                System.out.println("Account not found for the given transaction ID.");
            }
        } else {
            System.out.println("Invalid transaction ID.");
        }
    }

    private static Account findAccountByNumber(long accountNumber) {
        for (Account acc : accountList) {
            if (acc.getAccount_Number() == accountNumber) {
                return acc;
            }
        }
        return null;
    }


}

