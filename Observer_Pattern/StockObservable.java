public interface StockObservable {
    void addObserver(StockObserver observer);
    void removeObserver(StockObserver observer);
    void notifyObservers();
    boolean purchase(int quantity);
    void restock(int quantity);
    
}

