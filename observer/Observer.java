public class Observer {

    public static void main(String[] args) {

        CurrencyExchange exchange = new CurrencyExchange();


        IObserver mobile = new MobileAppObserver();
        IObserver web = new WebObserver();
        IObserver email = new EmailObserver();

        
        exchange.addObserver(mobile);
        exchange.addObserver(web);
        exchange.addObserver(email);

        
        exchange.setRate("USD", 500);
        System.out.println();

        exchange.setRate("EUR", 550);
    }
}