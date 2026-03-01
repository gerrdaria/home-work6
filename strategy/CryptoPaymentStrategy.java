public class CryptoPaymentStrategy implements IPaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " in CRYPTO");
    }
}