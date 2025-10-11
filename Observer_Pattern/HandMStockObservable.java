// interface to manage stock and notify observers about stock changes.
import java.util.*;


class HandMStockObservable implements StockObservable 
{
    private int availablestock;
    private List<StockObserver> observers;

    
    
    // constructor to initialize stock and observer list
    public HandMStockObservable(int initialStock) {
        this.availablestock = initialStock;
        this.observers = new ArrayList<>();
    }
    
    @Override
    public void addObserver(StockObserver observer) {
        observers.add(observer);
    }
    @Override
    public void removeObserver(StockObserver observer) {
        observers.remove(observer);
    }
    @Override
    public void restock(int quantity){
        // should update the stock of this observable as a whole
       
    boolean flag = availablestock==0;
    this.availablestock+= quantity;
    if(flag && availablestock>0){
         notifyObservers();
    }
 }

    
    @Override
    public void notifyObservers() {
        for (StockObserver observer : observers) {
            observer.update(availablestock);
        }
    }

    public String getinformation(){
        return "H&M Stock available: " + availablestock;
    }

    @Override
    public boolean purchase(int quantity) {
        if (quantity <= availablestock) {
            availablestock -= quantity;
            return true;
        } else {
            System.out.println("Purchase failed. Not enough stock available.");
            return false;
        }
    }
}