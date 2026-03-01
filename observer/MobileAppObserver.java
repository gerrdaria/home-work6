public class MobileAppObserver implements IObserver {

    @Override
    public void update(String currency, double rate) {
        System.out.println("Mobile app: " + currency + " = " + rate);
    }
}