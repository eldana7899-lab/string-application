package main.java.com.pluralsight;

public class Receipt {
    public static void main(String[] args) {

        // Question 1: Item name and price
        String itemName = "apples";
        double itemPrice = 7.10;

        // Question 2: Quantity
        int quantity = 3;

        // Question 3: Print the receipt
        System.out.println ("You bought " + quantity + " "
                + itemName + " for $" + itemPrice);
    }
}