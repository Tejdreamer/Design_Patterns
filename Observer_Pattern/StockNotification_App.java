// This is the client code where we wil be simulating the restock action by H&M and notifying the observers
import java.util.*;
public class StockNotification_App {
    public static void main(String[] args) {
        // Create an observable for H&M stock
        HandMStockObservable hmStock = new HandMStockObservable(10); // initial stock is 10
        // Create observers
        EmailNotificationObserver emailObserver = new EmailNotificationObserver("Tej.@example.com", hmStock);
        PushNotificationObserver pushObserver = new PushNotificationObserver("123-456-7890", hmStock);
        // Register observers with the observable
        hmStock.addObserver(emailObserver);
        hmStock.addObserver(pushObserver);
        // Simulate stock purchases
        hmStock.purchase(10); // all stock purchased, stock is now 0
        // Now restock the item

        System.out.println("Restocking 20 items...");
        hmStock.restock(20); // restock 20 items, observers should be notified

        hmStock.removeObserver(pushObserver); // removing push observer

        // Restock again to see only email observer gets notified
        hmStock.purchase(20); // all stock purchased, stock is now 0
        System.out.println("Restocking 15 items...");
        hmStock.restock(15); // restock 15 items, only email observer should be notified
            
    }
}
