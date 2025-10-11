// this observer get the restock notification as push notification

class PushNotificationObserver implements StockObserver {
    private String phoneNumber;
    public HandMStockObservable sob; // it gives the observable to this observer so that any info can be fetched from observable if needed

    public PushNotificationObserver(String phoneNumber, HandMStockObservable sob) {
        this.phoneNumber = phoneNumber;
        this.sob = sob;
    }

    @Override
    public void update(int quantity) {
        System.out.println("Push Notification sent to " + phoneNumber + ": Stock is back in availability with quantity: " + quantity);
        String info = sob.getinformation(); // fetching some info from observable
        System.out.println("Additional Info: " + info);
    }
}