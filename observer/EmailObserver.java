public class EmailObserver implements IObserver {

    @Override
    public void update(String currency, double rate) {
        System.out.println("Email sent: " + currency + " = " + rate);
    }
}