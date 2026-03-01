public class CardPaymentStrategy implements IPaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " by CARD");
    }
}