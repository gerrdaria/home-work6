public class PayPalPaymentStrategy implements IPaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via PayPal");
    }
}