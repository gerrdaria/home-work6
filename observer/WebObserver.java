public class WebObserver implements IObserver {

    @Override
    public void update(String currency, double rate) {
        System.out.println("Website updated: " + currency + " = " + rate);
    }
}