class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cardHolderName;
    private String cvv;
    private String expiryDate;

    public CreditCardPayment(String cardNumber, String cardHolderName, String cvv, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit/debit card");
    }
}

class UPIPayment implements PaymentStrategy {
    private String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using UPI");
    }
}

class PaypalPayment implements PaymentStrategy {
    private String emailId;
    private String password;

    public PaypalPayment(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using PayPal");
    }
}

// parent class that uses the strategy
class Shopping {
    private PaymentStrategy paymentMethod;

    public Shopping(PaymentStrategy paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void pay(int amount) {
        paymentMethod.pay(amount);
    }
}

// client code

public class Strategy_Design_Pattern {
    public static void main(String[] args) {
        Shopping shopping1 = new Shopping(new CreditCardPayment("1234567890123456", "John Doe", "123", "12/25"));
        shopping1.pay(1000);

        Shopping shopping2 = new Shopping(new UPIPayment("john@upi"));
        shopping2.pay(500);

        Shopping shopping3 = new Shopping(new PaypalPayment("Tej@gmail.com", "password123"));
        shopping3.pay(750);
    }
}


// by this we follow Open/Closed Principle as we can add new payment methods without modifying existing code
// and we can easily switch between different payment strategies at runtime