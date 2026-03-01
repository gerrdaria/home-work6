import java.util.Scanner;

public class Strategy {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PaymentContext context = new PaymentContext();

        System.out.println("Choose payment method:");
        System.out.println("1 - Card");
        System.out.println("2 - PayPal");
        System.out.println("3 - Crypto");

        System.out.print("Your choice: ");
        int choice = sc.nextInt();

        IPaymentStrategy strategy;

        if (choice == 1) {
            strategy = new CardPaymentStrategy();
        } else if (choice == 2) {
            strategy = new PayPalPaymentStrategy();
        } else if (choice == 3) {
            strategy = new CryptoPaymentStrategy();
        } else {
            System.out.println("Wrong choice. Default = Card.");
            strategy = new CardPaymentStrategy();
        }

        context.setStrategy(strategy);

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        context.processPayment(amount);

        
        System.out.println("\nSwitching to Crypto without changing PaymentContext code:");
        context.setStrategy(new CryptoPaymentStrategy());
        context.processPayment(amount);

        sc.close();
    }
}