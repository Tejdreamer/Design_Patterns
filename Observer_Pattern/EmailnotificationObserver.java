// this observer get the stock updated in email

class EmailNotificationObserver implements StockObserver {
    private String email;
    public HandMStockObservable sob; // it gives the observable to this observer so that any info can be fetched from observable if needed

    public EmailNotificationObserver(String email, HandMStockObservable sob) {
        this.email = email;
        this.sob = sob;
    }

    @Override
    public void update(int quantity) {
        System.out.println("Email sent to " + email + ": Stock is back in availability with quantity: " + quantity);
        String info = sob.getinformation(); // fetching some info from observable
        System.out.println("Additional Info: " + info);
    }
}
