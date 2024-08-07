package ExceptionHandling;

import java.util.Scanner;

//Use of try-catch-finally

public class ECommerceDemo {

    static class Item{
        private String productName;
        private int stock;

        public Item(String productName, int stock){
            this.productName=productName;
            this.stock = stock;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public int getStock() {
            return stock;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "productName='" + productName + '\'' +
                    ", stock=" + stock +
                    '}';
        }

        //method to purchase
        public void purchase(int quantity) throws InvalidQuantityException, OutOfStockException{

            if(quantity<=0){
                throw new InvalidQuantityException("Invalid quantity: " + quantity + ". Quantity must be greater than zero.");
            }
            if (quantity > stock){
                throw new OutOfStockException("The item " + productName + " is out of stock.");
            }
        }
    }

    static class InvalidQuantityException extends Exception{
        public InvalidQuantityException(String message) {
            super(message);
        }
    }

    static class OutOfStockException extends Exception {
        public OutOfStockException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {

        Item item = new Item("Laptops",10);

        Scanner sc = new Scanner(System.in);

        System.out.println(item);

        System.out.println("Enter Quantity to purchase >> "+ item.getProductName());
        int n = sc.nextInt();

        try {
            item.purchase(n);
            System.out.println("Purchase successful!");
        } catch (InvalidQuantityException | OutOfStockException e) {
            throw new RuntimeException(e);
        } finally {
                System.out.println("Remaining stock for " + item.getProductName() + ": " + item.getStock());
        }

    }

}
