package Interfaces;

public class PayPal implements Payment{

    protected long transactionId = 0;


    @Override
    public long processPayment(double amount, long accountNumber, long accountNumber1) {
        System.out.println("Processing payment of $" + amount + " through PayPal.");
        return RandomNumberGenerator.generateTransactionId();
    }

    @Override
    public void refundPayment(String transactionId, double amount) {
        System.out.println("Refunding payment of $" + amount + " through PayPal for transaction ID: " + transactionId);
    }

    @Override
    public String checkStatus(String transactionId) {
        System.out.println("Checking status of transaction ID: " + transactionId + " through PayPal.");
        return "Status from paypal";
    }



}
class RandomNumberGenerator {

    public static long generateTransactionId(){
        long min = 1000000000L; // Smallest 10-digit number
        long max = 9999999999L; // Largest 10-digit number
        long randomNumber = min + (long)(Math.random() * (max - min));
       // System.out.println("Random 10-digit number: " + randomNumber);
        return randomNumber;
    }
}
