package OOP_Concepts.HotelManagement_Example;

public class CreditCardPayment implements Payment{

    private long cardNumber;
    private String cardHolderName;

    public CreditCardPayment(long cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount +
                " for card number " + cardNumber + " (Card Holder: " + cardHolderName + ")");
    }
}
