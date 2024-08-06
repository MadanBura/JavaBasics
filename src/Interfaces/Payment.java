package Interfaces;

public interface Payment {
    long processPayment(double amount, long accountNum, long accountNum1);
    void refundPayment(String transactionId, double amount);
    String checkStatus(String transactionId);
}
